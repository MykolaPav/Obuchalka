package TasksJavaRush.Course_4;
/*
Допишите код метода setName,
чтобы с его помощью установить значение (private String fullName)
равное значению локальной переменной String fullName.
 */
public class Solution6 {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        this.fullName = fullName;
    }
    public void javaRush() {
        //
    }
}
