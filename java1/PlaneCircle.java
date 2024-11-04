public class PlaneCircle extends Circle {
    public double cx, cy;
    private double r;
    public PlaneCircle(double r, double x, double y) {

        this.cx = x;
        this.cy = y;
    }

    
    public boolean isInside(double x, double y) {
        double dx = x - cx, dy = y - cy;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return (distance < r);
    }

    public static void main(String[] args) {
        PlaneCircle cr = new PlaneCircle(15, 10, 20);
        System.out.println(cr.isInside(10, 20)); // Output: true
    }
}
