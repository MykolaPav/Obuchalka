package TasksJavaRush.Course_17.Solution_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CrUD - Create, Update, Delete.

Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u - обновляет данные человека с данным id
-d - производит логическое удаление человека с id, заменяет все его данные на null
-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке.
Все люди должны храниться в allPeople.
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример параметров:
-c Миронов м 15/04/1990

Пример вывода для параметра -і:
Миронов м 15-Apr-1990
 */
public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
    public static void main(String[] args) throws ParseException {
        String name;
        Sex sex;
        Date bd;
        Person p;
        int id;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        if (args[0].equals("-c")) {
            name = args[1];
            sex = (args[2] == "м") ? Sex.MALE : Sex.FEMALE;
            bd = format.parse(args[3]);
            if (sex == Sex.MALE) {
                p = Person.createMale(name, bd);
            } else {
                p = Person.createFemale(name, bd);
            }
            allPeople.add(p);
            System.out.println(allPeople.indexOf(p));
        }
        if (args[0].equals("-u")) {
            id = Integer.parseInt(args[1]);
            name = args[2];
            sex = (args[3] == "м") ? Sex.MALE : Sex.FEMALE;
            bd = format.parse(args[4]);
            p = allPeople.get(id);
            p.setName(name);
            p.setSex(sex);
            p.setBirthDate(bd);
        }
        if (args[0].equals("-d")) {
            id = Integer.parseInt(args[1]);
            p = allPeople.get(id);
            p.setSex(null);
            p.setBirthDate(null);
            p.setName(null);
        }
        if (args[0].equals("-i")) {
            id = Integer.parseInt(args[1]);
            p = allPeople.get(id);
            String sx = (p.getSex() == Sex.MALE) ? "м" : "ж";
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            System.out.println(p.getName() + " " + sx + " " + sdf.format(p.getBirthDate()));
        }
    }
}
