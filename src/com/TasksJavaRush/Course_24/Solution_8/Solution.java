package com.TasksJavaRush.Course_24.Solution_8;

import java.util.List;

/*
Как избежать Copy+Paste
*/
public class Solution {
    public static void main(String[] args) {
        List<Pet> pet = Util.getPets();
        List<Sayable> pets = Util.convertPetToSayable(pet);
        Util.printDialog(pets);
    }
}
