package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public abstract class Animal {
//  Note: If you don't set a constructor, it has a default.
//  The 4 types: Private, default, protected, public
    protected String type;
    protected String food;

    public Animal(String type, String food) {
        this.type = type;
        this.food = food;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setFood(String food) {
        this.food=food;
    }

    public String getType() {
        return this.type;
    }

    public String getFood() {
        return this.food;
    }

//    Problem with Inheritance: Sometimes you don't want a method to behave the same way
//    for all its children but you want it to exist for all your children, you create an abstract method.
//    public void swim() {
//        Log.d("love-swim", "I love to swim");
//    }
    public abstract void swim();



}
