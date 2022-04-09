package vessels;

public class Vessel implements Sailable {
    public Point[] points;

    public Vessel(int length) {
        this.points = new Point[length];
    }

    public int getLength() {
        return points.length;
    }

    @Override
    public void sail() {

    }
}
