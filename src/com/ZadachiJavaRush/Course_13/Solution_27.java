package com.ZadachiJavaRush.Course_13;

/*
Сказка Репка:
1. Реализовать интерфейс RepkaItem в классе Person.
2. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'.

Пример:
Бабка за Дедку
Дедка за Репку

3. Исправить логическую ошибку цикла в методе tell класса RepkaStory.
4. Выполнить метод main и наслаждаться сказкой!
 */
//public class Solution_27 {
//    public void javaRush()  {
//        List<Person> plot = new ArrayList<Person>();
//        plot.add(new Person("Репка", "Репку"));
//        plot.add(new Person("Дедка", "Дедку"));
//        plot.add(new Person("Бабка", "Бабку"));
//        plot.add(new Person("Внучка", "Внучку"));
//        RepkaStory.tell(plot);
//    }
//}
//
//public class Person implements RepkaItem {
//    private String name;
//    private String namePadezh;
//
//    public Person(String name, String namePadezh) {
//        this.name = name;
//        this.namePadezh = namePadezh;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getNamePadezh() {
//        return namePadezh;
//    }
//
//    public void setNamePadezh(String namePadezh) {
//        this.namePadezh = namePadezh;
//    }
//    @Override
//    public String getNamePadezh();
//}
//
//public interface RepkaItem {
//    public String getNamePadezh();
//}
//
//
//
//
//public class RepkaStory {
//    static void tell(List<Person> items) {
//        Person first;
//        Person second;
//        for (int i = items.size() - 1; i > 0; i--) {
//            first = items.get(i - 1);
//            second = items.get(i);
//            first.pull(second);
//        }
//    }
//}
