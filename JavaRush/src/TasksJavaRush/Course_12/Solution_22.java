package TasksJavaRush.Course_12;
/*
Переопредели метод setName в классе Cat так, чтобы программа выдавала на экран надпись

"Я - кот"
 */
public class Solution_22 {
    public void javaRush()  {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
        @Override
        public void setName(String name) {
            super.setName("Я - кот");
        }
    }
}
