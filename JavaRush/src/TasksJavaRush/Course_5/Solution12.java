package TasksJavaRush.Course_5;
import java.io.IOException;

/*
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
 */
public class Solution12 {
    public void javaRush() throws IOException {
        //
    }
    public class Circle {
        int centerX;
        int centerY;
        int radius;
        int width;
        int colour;

        public void initialize (int centerX, int centerY, int radius){
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }
        public void initialize (int centerX, int centerY, int radius, int width){
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
        }
        public void initialize (int centerX, int centerY, int radius, int width, int colour){
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
            this.colour = colour;
        }

    }

}
