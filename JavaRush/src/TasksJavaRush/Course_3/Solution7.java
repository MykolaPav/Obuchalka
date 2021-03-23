package TasksJavaRush.Course_3;
/*
Создать 5 зергов, 3 протосса и 4 террана.
Дать им всем уникальные имена.
 */
public class Solution7 {
    public void javaRush(){
        Zerg zerg1 = new Zerg();
        zerg1.name = "1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "5";
        Protoss protoss1 = new Protoss();
        protoss1.name = "11";
        Protoss protoss2 = new Protoss();
        protoss2.name = "22";
        Protoss protoss3 = new Protoss();
        protoss3.name = "33";
        Terran terran1 = new Terran();
        terran1.name = "111";
        Terran terran2 = new Terran();
        terran2.name = "222";
        Terran terran3 = new Terran();
        terran3.name = "333";
        Terran terran4 = new Terran();
        terran4.name = "444";
    }
    public static class Zerg {
        public String name;
    }
    public static class Protoss {
        public String name;
    }
    public static class Terran {
        public String name;
    }
}
