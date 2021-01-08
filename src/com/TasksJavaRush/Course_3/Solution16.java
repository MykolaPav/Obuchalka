package com.TasksJavaRush.Course_3;
/*
Вывести на экран следующий текст - две строки:
It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"

Подсказка:
\” – экранирование двойной кавычки;
\\ – экранирование обратной косой черты (\).

Больше про экранирование символов и Escape-последовательности в Java читай в статье.
 */
public class Solution16 {
    public void javaRush(){
        String a = ("It's Windows path: \"C:\\Program Files\\Java\\\\jdk1.7.0\\bin");
        String b = ("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");
        System.out.println(a);
        System.out.println(b);
    }
}
