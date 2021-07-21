package j_2_HW_1;

public class Main {
    public static void main(String[] args) {
//        Cat cat = ;
//        Human human = ;
//       Robo robo = ;
//        Wall
//        Treadmill treadmill = new Treadmill(150);
//
//        System.out.println(cat.jump(wall));
//        System.out.println(cat.run(treadmill));
//        System.out.println(human.jump(wall));
//        System.out.println(human.run(treadmill));
//        System.out.println(robo.jump(wall));
//        System.out.println(robo.run(treadmill));


        Sporty[] sporties = {
                new Human(5, 1050),
                new Cat(3, 150),
                new Robo()
        };

        Obstacles[] obstacles = {
                new Wall(2),
                new Treadmill(150),
                new Treadmill(1000),

        };
        for (Sporty s : sporties) {
            for (Obstacles o : obstacles) {
                if (!o.tryDoIt(s)) {
                    break;
                }
            }
        }

    }
}
