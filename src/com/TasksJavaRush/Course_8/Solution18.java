package com.TasksJavaRush.Course_8;

import java.io.IOException;
import java.util.*;

/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
 */
public class Solution18 {
    public static Map<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Smith", "Jacob");
        map.put("Johnson", "Charlie");
        map.put("Williams", "Amelia");
        map.put("Jones", "Olivia");
        map.put("Brown", "Olivia");
        map.put("Davis", "Jack");
        map.put("Miller", "Harry");
        map.put("Wilson", "Eva");
        map.put("Moore", "Sophia");
        map.put("Taylor", "Jessica");
        return map;

    }
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        List<String> set = new ArrayList<>(copy.values());
        for(Map.Entry<String, String> pair : copy.entrySet()){
            int x = 0;
            for(String value : set){
                if(value.equals(pair.getValue())){
                    x++;}
                if(x > 1)
                    removeItemFromMapByValue(map, pair.getValue());}
        }
    }
    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }
    public void javaRush() throws IOException {
        System.out.println(createMap());
    }
}
