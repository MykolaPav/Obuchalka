package com.ZadachiJavaRush.Course_6;
import java.io.IOException;

/*
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов
(статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.
 */
public class Solution4 {
    public void javaRush() throws IOException {
        //
    }
    class Cat {
        public  int catCount = 0;
        //напишите тут ваш код
        public Cat() {                //1.Добавь в класс Cat конструктор без параметров public Cat().
            catCount ++;                //2.Конструктор класса должен на 1 увеличивать значение переменной catCount.
        }
        public void finalize() {                //3.Добавь в класс Cat метод finalize. 4.Метод finalize ничего не должен возвращать (тип возвращаемого значения void).
            catCount --;                //5.Метод finalize должен уменьшать переменную catCount на 1.
        }
    }
}