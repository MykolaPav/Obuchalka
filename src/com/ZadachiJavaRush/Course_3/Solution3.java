package com.ZadachiJavaRush.Course_3;
/*
Напиши код метода convertEurToUsd, который переводит евро в доллары по заданному курсу.
Для возврата результата из метода convertEurToUsd используй оператор return. Пример: return 123*435;
Вызови метод convertEurToUsd дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
 */
public class Solution3 {
    public void javaRush(){
        System.out.println(rate(100,1.5));
        System.out.println(rate(200,1.5));

    }
    public double rate(int eu, double exRa){
        return  (eu*exRa);

    }
}
