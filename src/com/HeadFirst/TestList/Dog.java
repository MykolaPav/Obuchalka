package com.HeadFirst.TestList;

public class Dog extends Animal
{
    @Override
    public String makeVoice() {
        return "Гав гав!";
    }

    @Override
    public String eat() {
        return "meat";
    }
}
