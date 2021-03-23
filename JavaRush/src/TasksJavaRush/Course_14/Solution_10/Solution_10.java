package TasksJavaRush.Course_14.Solution_10;

import java.io.IOException;

/*
1. Создать абстрактный класс Drink с реализованным методом public void taste(), который выводит в консоль "Вкусно".
2. Создать класс Wine, который наследуется от Drink, с реализованным методом public String getHolidayName(), который возвращает строку "День Рождения".
3. Создать класс BubblyWine, который наследуется от Wine, с реализованным методом public String getHolidayName(), который возвращает строку "Новый Год".
4. Написать реализацию методов getDeliciousDrink, getWine, getBubblyWine.
5. Все классы должны находиться в отдельных файлах.
 */
public class Solution_10 {
    public void javaRush() throws IOException {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        return new Wine();
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getBubblyWine() {
        return new BubblyWine();
    }
}
