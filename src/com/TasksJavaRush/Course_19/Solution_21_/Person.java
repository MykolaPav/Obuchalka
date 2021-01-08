package com.TasksJavaRush.Course_19.Solution_21_;

import java.util.Date;

public class Person {
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
