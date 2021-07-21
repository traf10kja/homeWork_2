package j_2_HW_1;

public class Treadmill implements Obstacles {
    private int distRun;

    public Treadmill(int distRun) {
        this.distRun = distRun;
    }

    @Override
    public boolean tryDoIt(Sporty s) {
        return s.run(distRun);
    }
}
