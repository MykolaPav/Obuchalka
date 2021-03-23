package TasksJavaRush.Course_13;
/*
1. В классе Today реализовать интерфейс Weather.
2. Подумай, как связан параметр type с методом getWeatherType().
3. Интерфейсы Weather и WeatherType уже реализованы в отдельных файлах.
 */
public class Solution_17 {
    public void javaRush()  {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }
    interface Weather {
        String getWeatherType();
    }
    interface WeatherType {
        String CLOUDY = "Cloudy";
        String FOGGY = "Foggy";
        String FREEZING = "Freezing";
    }

    static class Today implements Weather {
        private String type;



        Today(String type) {
            this.type = type;
        }


        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }


        @Override
        public String getWeatherType() {
            return type ;
        }
    }
}


