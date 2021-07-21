package j_2_HW_1;

public class Cat implements Sporty {
    private int jumpHigh;
    private int runDistance;

    public Cat(int jumpHigh, int runDistance) {
        this.jumpHigh = jumpHigh;
        this.runDistance = runDistance;
    }

    public Cat() {
        this(3, 300);
    }

    @Override
    public boolean jump(int high) {
        if (high <= jumpHigh) {
            System.out.println("Cat jump over " + high + " meters");
            return true;
        }
        System.out.println("Cat can't jump over " + high + " meters");
        return false;
    }


    @Override
    public boolean run(int dist) {
        if (dist <= runDistance) {
            System.out.println("Cat run " + dist + " meters");
            return true;
        }
        System.out.println("Cat can't run " + dist + " meters");
        return false;
    }

}
