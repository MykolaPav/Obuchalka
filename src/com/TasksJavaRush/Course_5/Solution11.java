package com.TasksJavaRush.Course_5;
import java.io.IOException;

/*
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
 */
public class Solution11 {
    public void javaRush() throws IOException {
        //
    }
    public class Dog{
        String name;
        int height;
        String colour;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int height){
        this.name = name;
        this.height = height;
    }
    public void initialize(String name, int height, String colour){
        this.name = name;
        this.height = height;
        this.colour = colour;
    }
    }
}
