package TasksJavaRush.Course_5;
import java.io.IOException;

/*
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
 */
public class Solution19 {
    public void javaRush() throws IOException {
        //
    }
    public class Dog{
        String name;
        String colour;
        int height;

        public Dog(String name) {
            this.name = name;
        }

        public Dog(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public Dog(String name, String colour, int height) {
            this.name = name;
            this.colour = colour;
            this.height = height;
        }
    }
}
