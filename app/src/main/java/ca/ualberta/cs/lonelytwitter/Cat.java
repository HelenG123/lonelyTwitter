package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class Cat extends Animal {
    public Cat(String type, String food) {
        super(type, food);
//        this.type=type;
//        this.food=food;
    }

    public void swim() {
        Log.d("cat-swim", "I hate swimming");
    }
}
