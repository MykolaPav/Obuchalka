package TasksJavaRush.Course_14.Factory;

public class BelarusianHen extends Hen implements Country {
    int getCountOfEggsPerMonth() {
        return 70;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.BELARUS +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
