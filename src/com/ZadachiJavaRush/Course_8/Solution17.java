package com.ZadachiJavaRush.Course_8;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/*
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
 */
public class Solution17 {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне1", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("MAY 2 2012"));
        map.put("Сталлоне3", dateFormat.parse("MAY 3 2012"));
        map.put("Сталлоне4", dateFormat.parse("MAY 4 2012"));
        map.put("Сталлоне5", dateFormat.parse("MAY 5 2012"));
        map.put("Сталлоне6", dateFormat.parse("MAY 6 2012"));
        map.put("Сталлоне7", dateFormat.parse("MAY 7 2012"));
        map.put("Сталлоне8", dateFormat.parse("MAY 8 2012"));
        map.put("Сталлоне9", dateFormat.parse("MAY 9 2012"));
        map.put("Сталлоне10", dateFormat.parse("MAY 10 2012"));

        return map;
    }
    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> newMap = new HashMap<>(map);
            for (Map.Entry<String, Date> pair : newMap.entrySet()) {
                String name = pair.getKey();
                Date data = pair.getValue();
                int month = data.getMonth();
                if (month == 5 || month == 6 || month == 7) {
                    map.remove(name);
                }
            }
    }
    public void javaRush() throws IOException {

    }
}
