package com.TasksJavaRush.Course_23.Solution_4;

/*
Inner 3
*/

import java.util.List;
import java.util.Map;

public class Solution
{

    private List<Task> tasks;
    private List<String> names;

    private DbDataProvider taskDataProvider = new TaskDataProvider();
    private DbDataProvider nameDataProvider = new NameDataProvider();

    private class NameDataProvider implements DbDataProvider< String>
    {
        @Override
        public void refreshAllData(Map criteria)
        {   //Входные данные обновляют данные списка names
            names = MockDB.getFakeNames(criteria);
        }
    }

    private class TaskDataProvider implements DbDataProvider<Task>
    {
        @Override
        public void refreshAllData(Map criteria)
        {   //Входные данные обновляют данные списка tasks
            tasks = MockDB.getFakeTasks(criteria);
        }
    }


    public void refresh()
    {
        Map taskCriteria = MockView.getFakeTaskCriteria();
        taskDataProvider.refreshAllData(taskCriteria);

        Map nameCriteria = MockView.getFakeNameCriteria();
        nameDataProvider.refreshAllData(nameCriteria);
    }

    private interface DbDataProvider<T>
    {
        void refreshAllData(Map criteria);
    }

    class Task {}
    public static void main(String[] args) {}
}
