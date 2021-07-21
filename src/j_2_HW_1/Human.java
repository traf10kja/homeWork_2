package j_2_HW_1;

public class Human implements Sporty {
    private int jumpHigh;
    private int runDistance;

    public Human (int jumpHigh, int runDistance) {
        this.jumpHigh = jumpHigh;
        this.runDistance = runDistance;
    }

    public Human() {
        this(4, 1000);
    }

    @Override
    public boolean jump(int high) {
        if (high <= jumpHigh) {
            System.out.println("Human jump over " + high + " meters");
            return true;
        }
        System.out.println("Human can't jump over " + high + " meters");
        return false;
    }


    @Override
    public boolean run(int dist) {
        if (dist <= runDistance) {
            System.out.println("Human run " + dist + " meters");
            return true;
        }
        System.out.println("Human can't run " + dist + " meters");
        return false;
    }

}
