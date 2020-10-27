package com.ZadachiJavaRush.Course_15;

/*
В статическом блоке выбросьте Exception
В результате класс не загрузится, и вы увидите сообщение об ошибке вместо значения переменной B

Exception in thread "main" java.lang.ExceptionInInitializerError
at java.lang.Class.forName0(Native Method)
at java.lang.Class.forName(Class.java:186)
at com.intellij.rt.execution.application.AppMain.main(AppMain.java:113)
Caused by: java.lang.RuntimeException:
at com.javarush.task.task15.task1517.Solution.<clinit>(Solution.java:22)

Hint: Нужно погуглить причину, если получилось следующее:
java: initializer must be able to complete normally
java: unreachable statement
 */
public class Solution_17 {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут
        try {

        } catch (Exception e) {
e.printStackTrace();
        }
    }

    public static int B = A/0;
    public void javaRush() throws Exception {
        System.out.println(B);
    }
}
