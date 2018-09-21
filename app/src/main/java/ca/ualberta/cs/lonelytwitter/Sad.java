package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.Date;

public class Sad extends CurrentMood {
    public Sad(Date date) {
        super(date);
    }

    public void whatsMyMood() {
        Log.d("sad-mood", "I'm sad! :(");
    }

}
