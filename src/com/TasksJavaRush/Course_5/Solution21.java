package com.TasksJavaRush.Course_5;
import java.io.IOException;

/*
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height
(верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.
Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
 */
public class Solution21 {
    public void javaRush() throws IOException {
        //
    }
    public class Rectangle {
        int top;
        int left;
        int width;
        int height;

        public Rectangle(int left) {
            this.left = left;
        }

        public Rectangle(int top, int width) {
            this.top = top;
            this.width = width;
        }

        public Rectangle(int top, int left, int width) {
            this.top = top;
            this.left = left;
            this.width = width;
        }
        public Rectangle(Rectangle rectangle){
            this.left = rectangle.left;

        }
    }

}
