package com.ZadachiJavaRush.Course_4;
/*
1. Если переменная помечена словом "static", то она общая для всех объектов,
что будут созданы.(Что-то вроде общей ячейки в банке, из которой все могут брать что-то, и все могут туда ложить что-то).
2. THIS используйте, когда имена вашей переменной в классе и переменной в методе совпадают.
Не заморачивайтесь, просто помните - вызов переменной в методе - ее имя.
Вызов переменной в классе - this. + ее имя.
3. Если видишь что в метод объявлен СТАТИЧЕСКИМ, то про this ЗАБУДЬТЕ сразу!!!
Когда переменная или класс статитический, то он вызывается ClassName.methodName().
(Типа у вас есть класс Cat, а внутри - метод catCount(). Так вот чтоб его вызвать, юзайте Cat.catCount() . )
4. Короче: Нестатический метод - забей и юзай This.
Если статический, то вместо this пишешь название его класса.

Подсчитать суммарную стоимость яблок.
За суммарную стоимость яблок отвечает переменная public static int applesPrice.
 */
public class Solution2 {
    public void javaRush() {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        Apple apple3 = new Apple();
        apple2.addPrice(500);
        System.out.println("Стоимость яблок " + Apple.applesPrice);
    }
    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
           Apple.applesPrice +=applesPrice;
        }
    }
}
