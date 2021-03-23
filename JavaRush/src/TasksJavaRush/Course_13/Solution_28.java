package TasksJavaRush.Course_13;

/*
1. Разобраться в том, что тут написано.
2. Смириться со своей участью и продолжить разбираться в коде.
3. ...
4. Порадоваться, что мы все поняли.
5. Изменить код согласно новой архитектуре и добавить новую логику:
5.1. Сделать класс AbstractRobot абстрактным, вынести логику атаки и защиты из Robot в AbstractRobot.
5.2. Отредактировать класс Robot учитывая AbstractRobot.
5.3. Расширить класс BodyPart новой частью тела BodyPart.CHEST("грудь").
5.4. Добавить новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).
 */
//public class Solution_28 {
//    public void javaRush()  {
//        Robot amigo = new Robot("Амиго");
//        Robot enemy = new Robot("Сгибальщик-02");
//
//        doMove(amigo, enemy);
//        doMove(amigo, enemy);
//        doMove(enemy, amigo);
//        doMove(amigo, enemy);
//        doMove(enemy, amigo);
//        doMove(amigo, enemy);
//        doMove(enemy, amigo);
//        doMove(amigo, enemy);
//    }
//
//    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
//        BodyPart attacked = robotFirst.attack();
//        BodyPart defenced = robotFirst.defense();
//        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
//                robotFirst.getName(), robotSecond.getName(), attacked, defenced));
//    }
//}
//
//public class Robot implements Attackable, Defensable {
//    private static int hitCount;
//    private String name;
//
//    public Robot(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public BodyPart attack() {
//        BodyPart attackedBodyPart = null;
//        hitCount = hitCount + 1;
//
//        if (hitCount == 1) {
//            attackedBodyPart = BodyPart.ARM;
//        } else if (hitCount == 2) {
//            attackedBodyPart = BodyPart.HEAD;
//        } else if (hitCount == 3) {
//            hitCount = 0;
//            attackedBodyPart = BodyPart.LEG;
//        }
//        return attackedBodyPart;
//    }
//
//    public BodyPart defense() {
//        BodyPart defendedBodyPart = null;
//        hitCount = hitCount + 2;
//
//        if (hitCount == 1) {
//            defendedBodyPart = BodyPart.HEAD;
//        } else if (hitCount == 2) {
//            defendedBodyPart = BodyPart.LEG;
//        } else if (hitCount == 3) {
//            hitCount = 0;
//            defendedBodyPart = BodyPart.ARM;
//        }
//        return defendedBodyPart;
//    }
//}
//public class AbstractRobot {
//}
//public interface Defensable {
//    BodyPart defense();
//}
