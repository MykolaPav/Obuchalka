package TasksJavaRush.Course_3;
/*
Напиши код метода addTenPercent,
который увеличивает переданное целое число на 10%.
Для возврата результата из метода addTenPercent используй оператор return.

Пример:
return 123 * 435;
 */
public class Solution4 {
    public void javaRush(){
        System.out.println(addTenPercent(25));
    }
    public double addTenPercent(int i){
        //return i+i*0.1;
        //return i+(i*0.1);
        return i+(i*10.0/100.0);
    }
}
