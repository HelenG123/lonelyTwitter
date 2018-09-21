package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.Date;

public class Happy extends CurrentMood {
    public Happy(Date date) {
        super(date);
    }
//    public Happy()
//    {
//        super();
//    }
    public void whatsMyMood() {
        Log.d("happy-mood", "I'm happy! :)");
    }
}
