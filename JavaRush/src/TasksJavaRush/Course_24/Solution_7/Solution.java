package TasksJavaRush.Course_24.Solution_7;

/*
Реализация интерфейса используя локальный класс
*/

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Pet> pet = Util.getPets();
        List<Sayable> pets = Util.convertPetToSayable(pet);
        Util.printDialog(pets);
    }
}
