
package io.pivotal.pal.tracker;

import java.time.LocalDate;

public class TimeEntry {

    private long id;

    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    public TimeEntry(long pid, long usrId, LocalDate d, int h) {
        this.projectId = pid;
        this.userId = usrId;
        this.date = d;
        this.hours = h;
    }

    public TimeEntry(long id, long pid, long uid, LocalDate d, int h) {
        this.id = id;
        this.projectId = pid;
        this.userId = uid;
        this.date = d;
        this.hours = h;
    }

    public  TimeEntry() {}

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeEntry timeEntry = (TimeEntry) o;

        if (id != timeEntry.id) return false;
        if (projectId != timeEntry.projectId) return false;
        if (userId != timeEntry.userId) return false;
        if (hours != timeEntry.hours) return false;
        return date != null ? date.equals(timeEntry.date) : timeEntry.date == null;
    }


}
