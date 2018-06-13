package io.pivotal.pal.tracker;

import java.util.ArrayList;
import  java.util.HashMap;
import  java.util.List;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    private HashMap<Long, TimeEntry> _inMemRepo = new HashMap<>();

    public TimeEntry find(long id ) {
        return  this._inMemRepo.get(id);
    }

    public TimeEntry update(long id, TimeEntry te) {
        TimeEntry updatedEntry = new TimeEntry(
                    id,
                    te.getProjectId(),
                    te.getUserId(),
                    te.getDate(),
                    te.getHours()
                );
        
                _inMemRepo.replace(id, updatedEntry);
                return updatedEntry;


    }

    public TimeEntry create(TimeEntry te) {
        Long id = this._inMemRepo.size() + 1L;
        TimeEntry newTE = new TimeEntry(id, te.getProjectId(), te.getUserId(), te.getDate(), te.getHours());
        this._inMemRepo.put(id, newTE);
        return  newTE;
    }

    public void delete(long id) {
        this._inMemRepo.remove(id);
    }

    public List<TimeEntry> list() {
        return new ArrayList<>(this._inMemRepo.values());
    }
}
