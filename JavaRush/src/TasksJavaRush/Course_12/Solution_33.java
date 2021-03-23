package TasksJavaRush.Course_12;

/*
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).
 */
public class Solution_33 {
    public void javaRush() {
        int[] data = new int[]{-101, 2, 3, 5, -2, -8, -10, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int min = array[0];
        int index = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
            if (min == array[i])
                index = i;
        }
        //напишите тут ваш код

        return new Pair<Integer, Integer>(min, index);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
