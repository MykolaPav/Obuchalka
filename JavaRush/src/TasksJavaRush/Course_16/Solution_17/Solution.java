package TasksJavaRush.Course_16.Solution_17;
/*
1. Разберись, что делает программа.
2. Реализуй логику метода run так, чтобы каждую секунду через пробел
выдавался отсчет начиная с numSeconds до 1, а потом слово [Марш!] (см примеры).
3. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].

Пример для numSeconds=4 :
"4 3 2 1 Прервано!"

4. Если нить работает менее 3.5 секунд, она должна завершиться сама.
Пример для numSeconds=3 :
"3 2 1 Марш!"

PS: метод sleep выбрасывает InterruptedException.
 */

public class Solution {
    public static volatile int numSeconds = 3;

    public void javaRush() throws Exception {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            try {
                if (numSeconds == 4) {
                    for (int j = numSeconds; j > 0; j--) {
                        System.out.println(j);
                        Thread.sleep(1000);
                        numSeconds--;
                    }
                    interrupted();
                }
                for (int i = numSeconds; i > 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);
                    numSeconds--;
                }
                System.out.println("Марш!");
            } catch (InterruptedException e) {
                System.out.println("Прервано!");
            }
        }
    }
}
