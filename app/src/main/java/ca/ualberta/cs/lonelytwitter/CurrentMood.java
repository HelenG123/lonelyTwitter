package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class CurrentMood {
    protected Date date;

    public CurrentMood(Date date) {
        this.date = date;
    }

    public CurrentMood() {
        this.date = new Date();
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return this.date;
    }

    public abstract void whatsMyMood();
}
