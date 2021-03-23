package TasksJavaRush.Course_15.Solution_19;

import java.util.Scanner;

/*
1. В отдельных файлах создать классы Plane и Helicopter, реализующие интерфейс CanFly.
2. Класс Plane должен иметь конструктор с параметром int - количество перевозимых пассажиров.
3. В статическом методе reset класса Solution:
3.1. Считать с консоли параметр типа String.
3.2. Если параметр равен "helicopter", то статическому объекту CanFly result присвоить объект класса Helicopter.
3.3. Если параметр равен "plane", то считать второй параметр типа int(количество пассажиров), статическому объекту CanFly result присвоить объект класса Plane.
4. В статическом блоке инициализировать CanFly result вызвав метод reset.
5. Закрыть поток ввода методом close().
 */
public class Solution {
    public void javaRush() throws Exception {
        //
    }

    static {
      reset();
    }

    public static CanFly result;

    public static void reset() {
        Scanner sc = new Scanner(System.in);
        String pln = sc.nextLine();
        if (pln.equals("helicopter")) {
            result = new Helicopter();
        }
        if (pln.equals("plane")) {
            int x = sc.nextInt();
            result = new Plane(x);
        }
        sc.close();
    }
}
