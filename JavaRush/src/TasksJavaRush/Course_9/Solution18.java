package TasksJavaRush.Course_9;

import java.io.IOException;

/*
Есть четыре класса MyException, MyException2, MyException3, MyException4.
Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и любые два unchecked исключения.

Подсказка:
Изучи внимательно классы Exception1, Exception2, Exception3 из второй задачи этого блока.
 */
public class Solution18 {
    public void javaRush() throws IOException {
       //
    }
    static class MyException extends RuntimeException {

    }

    static class MyException2 extends Error {
    }

    static class MyException3 extends Exception {
    }

    static class MyException4 extends Exception {
    }
}
