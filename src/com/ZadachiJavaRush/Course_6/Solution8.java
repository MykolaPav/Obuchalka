package com.ZadachiJavaRush.Course_6;

import java.io.IOException;

/*
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.
 */
public class Solution8 {
    public static class Util {
        public static double getDistance(int x1, int y1, int x2, int y2) {
            int catet1 = x2 - x1;
            int catet2 = y2 - y1;
            double hypotenusa = Math.sqrt((catet1 * catet1) + (catet2 * catet2));
            return hypotenusa;
        }

        public void javaRush() throws IOException {
            //
        }
    }
}


// public class Util {
//     public static double getDistance(int x1, int y1, int x2, int y2) {
//         //напишите тут ваш код
//         int catet1 = x2-x1;
//     	int catet2 = y2-y1;
//     	double hypotenusa =  Math.sqrt((catet1*catet1) + (catet2*catet2));
//     	return hypotenusa;
//     }

//     public static void main(String[] args) {

//     }
// }
