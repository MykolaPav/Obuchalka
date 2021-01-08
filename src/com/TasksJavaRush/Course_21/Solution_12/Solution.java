package com.TasksJavaRush.Course_21.Solution_12;

public class Solution
{
    public static void main(String[] args)
    {
        DBConnectionManager dbConnectionManager = new DBConnectionManager();
        try (FakeConnection fakeConnection = dbConnectionManager.getFakeConnection())
        {
            System.out.println("Entering body of try block.");
            fakeConnection.usefulOperation();
            fakeConnection.unsupportedOperation();
        } catch (Exception e)
        { }
    }
}