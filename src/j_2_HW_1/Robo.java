package j_2_HW_1;

public class Robo implements Sporty {
    private int jumpHigh;
    private int runDistance;

    public Robo (int jumpHigh, int runDistance) {
        this.jumpHigh = jumpHigh;
        this.runDistance = runDistance;
    }

    public Robo() {
        this(1, 5000);
    }

    @Override
    public boolean jump(int high) {
        if (high <= jumpHigh) {
            System.out.println("Robot jump over " + high + " meters");
            return true;
        }
        System.out.println("Robot can't jump over " + high + " meters");
        return false;
    }


    @Override
    public boolean run(int dist) {
        if (dist <= runDistance) {
            System.out.println("Robot run " + dist + " meters");
            return true;
        }
        System.out.println("Robot can't run " + dist + " meters");
        return false;
    }

}
