package TasksJavaRush.Course_5;
import java.io.IOException;
/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.
 */
public class Solution2 {
    public void javaRush() throws IOException {
        Cat cat1 = new Cat();
        cat1.age = 5;
        cat1.weight = 7;
        cat1.strength = 7;

        Cat cat2 = new Cat();
        cat2.age = 3;
        cat2.weight = 7;
        cat2.strength = 7;
        System.out.println();
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
    public class Cat {
        public int age;
        public int weight;
        public int strength;

        public Cat() {
        }

        public boolean fight(Cat anotherCat) {
            int winAnotherCat = 0;
            int winThisCat = 0;

            if (anotherCat.age < this.age) winThisCat++;
            else if (anotherCat.age == this.age) ;
            else winAnotherCat++;
            if (anotherCat.strength < this.strength) winThisCat++;
            else if (anotherCat.strength == this.strength) ;
            else winAnotherCat++;
            if (anotherCat.weight < this.weight) winThisCat++;
            else if (anotherCat.weight == this.weight) ;
            else winAnotherCat++;
            if (winThisCat > winAnotherCat) return true;
            else return false;

        }


    }
}










//public class Cat {
//    public int age;
//    public int weight;
//    public int strength;
//
//    public Cat() {
//    }
//
//    public boolean fight(Cat anotherCat) {
//        int winAnotherCat = 0;
//        int winThisCat = 0;
//        if(anotherCat.age < this.age) winThisCat++;
//        else if (anotherCat.age == this.age);
//        else  winAnotherCat++;
//        if(anotherCat.strength < this.strength) winThisCat++;
//        else if (anotherCat.strength == this.strength);
//        else winAnotherCat++;
//        if(anotherCat.weight < this.weight) winThisCat++;
//        else if (anotherCat.weight == this.weight);
//        else winAnotherCat++;
//        if(winThisCat > winAnotherCat) return true;
//        else return false;
//    }
//
//    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        cat1.age = 10;
//        cat1.weight = 10;
//        cat1.strength = 10;
//
//        Cat cat2 = new Cat();
//        cat2.age = 12;
//        cat2.weight = 12;
//        cat2.strength = 15;
//        System.out.println(cat1.fight(cat2));
//        System.out.println(cat2.fight(cat1));
//
//    }
//}