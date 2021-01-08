package com.TasksJavaRush.Course_19.Solution_4;

import java.io.IOException;

public interface PersonScanner {
    Person read() throws IOException, Exception;

    void close() throws IOException;
}

