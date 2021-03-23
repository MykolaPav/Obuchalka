package TasksJavaRush.Course_14;

import java.io.IOException;

/*
Инициализировать объект obj таким классом, чтобы метод main выполнился без ошибок.
 */
public class Solution_6 {
    public void javaRush() throws IOException {
        Object obj = new Jerry();
//GrayMouse();  Mouse();  Jerry();
        Mouse mouse = (Mouse) obj;
        GrayMouse grayMouse = (GrayMouse) mouse;
        Jerry jerry = (Jerry) grayMouse;

        printClasses(obj, mouse, grayMouse, jerry);

    }

    public static void printClasses(Object obj, Mouse mouse, GrayMouse grayMouse, Jerry jerry) {
        System.out.println(jerry.getClass().getSimpleName());
        System.out.println(grayMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(obj.getClass().getSimpleName());
    }

    static class Mouse {
    }

    static class GrayMouse extends Mouse {
    }

    static class Jerry extends GrayMouse {
    }
}
