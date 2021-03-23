package TasksJavaRush.Course_9;

import TasksJavaRush.Course_0.Solution;

import java.io.IOException;

/*
В методе handleExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс возникшего исключения используя метод printStack.
Можно использовать только один блок try..catch
 */
public class Solution17 {
    public void javaRush() throws IOException {
        handleExceptions(new Solution());
    }
    public static void handleExceptions(Solution obj) {
//        try {
//            obj.method1();
//            obj.method2();
//            obj.method3();
//        } catch (RuntimeException e) {
//            printStack(e);
//        } catch (IndexOutOfBoundsException e) {
//            printStack(e);
//        }catch (NumberFormatException e) {
//            printStack(e);
//        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
