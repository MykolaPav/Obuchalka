package TasksJavaRush.Course_21.Solution_13_28;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hippodrome
{
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses)
    {
        this.horses = horses;
    }

    public List<Horse> getHorses()
    {
        return horses;
    }

    public void run() throws InterruptedException
    {
        for (int i = 0; i < 100; i++)
        {
            Thread.sleep(200);
            move();
            print();
        }
        getWinner();
    }
    public void move()
    {
        for (Horse horse : horses)
        {
            horse.move();
        }
    }
    public void print()
    {
        for (Horse horse : horses)
        {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }
    public Horse getWinner()
    {
        return horses.stream().max(Comparator.comparing(Horse::getDistance)).orElse(null);
    }
    public void printWinner()
    {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("Horse1", 3, 0));
        game.getHorses().add(new Horse("Horse2", 3, 0));
        game.getHorses().add(new Horse("Horse3", 3, 0));
        game.run();
        game.printWinner();
    }
}
