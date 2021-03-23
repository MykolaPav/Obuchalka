package TasksJavaRush.Course_6;
import java.io.IOException;

/*
Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
с помощью которых можно получить/изменить количество котов (переменную catCount).
 */
public class Solution7 {
    public static class  Cat{
        private static int catCount = 0;

        public Cat() {
            catCount++;
        }

        public static int getCatCount() {
           return catCount;

        }

        public static void setCatCount(int catCount) {
            Cat.catCount = catCount;

        }
    }
    public void javaRush() throws IOException {
        //
    }
}

// public class Cat {
//     private static int catCount = 0;

//     public Cat() {
//         catCount++;
//     }

//     public static int getCatCount() {
//         //напишите тут ваш код
//         return catCount;

//     }

//     public static void setCatCount(int catCount) {
//         //напишите тут ваш код
//         Cat.catCount = catCount;

//     }

//     public static void main(String[] args) {

//     }
// }