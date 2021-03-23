package TasksJavaRush.Course_19.Solution_3;

import java.util.HashMap;
import java.util.Map;

/**
 *Адаптируй IncomeData к Customer и Contact.
 * Классом-адаптером является IncomeDataAdapter.
 * Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
 * UA Ukraine
 * RU Russia
 * CA Canada
 * Дополнить телефонный номер нулями до 10 цифр при необходимости (смотри примеры).
 * Обратите внимание на формат вывода фамилии и имени человека.
 */
public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
static {
    countries.put("UA", "Ukraine");
    countries.put("RU", "Russia");
    countries.put("CA", "Canada");
}
    public static void javaRush() {
        //
    }
    public static class IncomeDataAdapter implements Customer, Contact {
    private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            return "+" + data.getCountryPhoneCode()
                       + String.format("%010d",
                         data.getPhoneNumber())
                        .replaceFirst("(\\d{3})(\\d{3})(\\d{2})(\\d{2})",
                                      "($1)$2-$3-$4"
            );
        }
    }

    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}
