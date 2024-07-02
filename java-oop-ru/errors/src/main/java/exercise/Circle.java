package exercise;

// BEGIN
public class Circle {
    private Point point;
    private int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public int getRadius() {
        return radius;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) throw new NegativeRadiusException();
        return Math.PI * radius * radius;
    }
}
// END
