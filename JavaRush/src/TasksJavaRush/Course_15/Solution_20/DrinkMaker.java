package TasksJavaRush.Course_15.Solution_20;

public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();
    void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}
