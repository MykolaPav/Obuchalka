package TasksJavaRush.Course_2;
/*
Реализуй метод print3.
Метод должен вывести переданную строку (слово) на экран три раза через пробел.
 */
public class Solution15 {
    public void javaRush(){
        print3("window");
        print3("file");
    }
    public void print3(String s){
        System.out.println(s+ " "+ " " +s+ " "+s);
    }

}
