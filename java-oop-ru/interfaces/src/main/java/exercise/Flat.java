package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;
    private double totalArea;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        totalArea = balconyArea + area;
        return totalArea;
    }

    @Override
    public int compareTo(Home another) {
        return another.getArea() == totalArea ? 0
                : totalArea > another.getArea() ? 1 : -1;
    }

    @Override
    public java.lang.String toString() {
        return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }
}
// END
