package TasksJavaRush.Course_14.Solution_13;

import java.io.IOException;

/*
1. Создай интерфейс CompItem.
2. Добавь в него метод String getName().
3. Создай классы Keyboard, Mouse, Monitor, которые реализуют интерфейс CompItem.
4. Метод getName() должен возвращать имя класса, например, для класса Keyboard будет "Keyboard".
5. Создай класс Computer.
6. В класс Computer добавь приватное поле keyboard типа Keyboard.
7. В класс Computer добавь приватное поле mouse типа Mouse.
8. В класс Computer добавь приватное поле monitor типа Monitor.
9. Создай конструктор с тремя параметрами в классе Computer используя комбинацию клавиш Alt+Insert (для Windows) внутри класса (команда Constructor).
10. Внутри конструктора инициализируйте все три поля (переменных) класса в соответствии с переданными параметрами.
11. Создай геттеры для полей класса Computer (в классе используй комбинацию клавиш Alt+Insert (для Windows) и выбери команду Getter).
12. Все созданные классы и интерфейс должны быть в отдельных файлах.
 */
public class Solution_13 {
    public void javaRush() throws IOException {
//        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
//        if (isWork(computer.getKeyboard()) &&
//                isWork(computer.getMonitor()) &&
//                isWork(computer.getMouse())) {
//            System.out.println("Work!");
//        }
    }

    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }
}
