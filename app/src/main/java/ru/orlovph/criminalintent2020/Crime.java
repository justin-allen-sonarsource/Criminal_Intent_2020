package ru.orlovph.criminalintent2020;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mID;
    private String title;
    private Date date;
    private boolean solved;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id){
        mID = id;
        date = new Date();
    }

    public UUID getmID() {
        return mID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }
}
