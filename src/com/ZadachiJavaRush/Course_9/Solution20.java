package com.ZadachiJavaRush.Course_9;

import java.io.IOException;

/*
Написать в цикле обратный отсчёт от 10 до 0. Для задержки использовать Thread.sleep(100);
Обернуть вызов sleep в try..catch.
 */
public class Solution20 {
    public void javaRush() throws IOException {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }
}
