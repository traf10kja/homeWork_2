package j_2_HW_1;

public class Wall implements Obstacles {
    private int wallHigh;

    public Wall(int wallHigh) {
        this.wallHigh = wallHigh;
    }

    @Override
    public boolean tryDoIt(Sporty s) {
        return s.jump(wallHigh);
    }
}
