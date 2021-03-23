package TasksJavaRush.Course_5;

/*
Разберись, что делает программа.
Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.
 */
public class Circle {
    public Color color = new Color();
    public  Circle() {
    }
    public void javaRush() {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }
        public class Color {
            String description;

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }
}



//public class Circle {
//    public Color color;
//
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.color.setDescription("Red");
//        System.out.println(circle.color.getDescription());
//    }
//
//    public Circle() {
//        color = new Color();
//    }
//
//    public class Color {
//        String description;
//
//        public String getDescription() {
//            return description;
//        }
//
//        public void setDescription(String description) {
//            this.description = description;
//        }
//    }
//}
