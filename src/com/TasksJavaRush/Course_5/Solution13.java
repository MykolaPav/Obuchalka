package com.TasksJavaRush.Course_5;
import java.io.IOException;

/*
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height
(верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(...)
Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
 */
public class Solution13 {
    public void javaRush() throws IOException {
        //
    }
    public class Rectangle{
        int top;
        int left;
        int width;
        int height;

        public void initialize(int top, int left, int width, int height){
            this.top = 10;
            this.left = 5;
            this.width = 10;
            this.height = 5;
        }
        public void initialize(int top, int left){
            this.top = 10;
            this.left = 5;

        }
        public void initialize(int left){

        }
        public void initialize(Rectangle rectangle){ // Копия
            this.top = rectangle.top;
            this.left = rectangle.left;
            this.width = rectangle.width;
            this.height = rectangle.height;
        }

    }

}



// public class Rectangle {
//     int left;
//     int top;
//     int width;
//     int height;

//   public void initialize(int left){
//     this.left = 10;
//     this.top = 10;
//     this.width = 5;
//     this.height = 5;
// }
//   public void initialize(int top, int width){
//     this.top = top;
//     this.width = width;
// }
//   public void initialize(int left, int top, int width){
//     this.left = left;
//     this.top = top;
//     this.width = 10;
//     this.height = 10;
// }
//   public void initialize(Rectangle rectangle){
//         this.top = rectangle.top;
//         this.left = rectangle.left;
//         this.width = rectangle.width;
//         this.height = rectangle.height;
// }

//     public static void main(String[] args) {

//     }
// }