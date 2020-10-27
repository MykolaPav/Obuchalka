package com.ZadachiJavaRush.Course_4;

/*
Помогите коту обрести имя с помощью метода setName.
 */
public class Solution3 {
    private String name = "безымянный кот";

    public void setName(String name) {
      this.name = name;

    }
    public static void javaRush() {
        Solution3 cat = new Solution3();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
