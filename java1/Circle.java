public class Circle {
    public static final double PI=3.14159;
    private double r;
    public Circle(double r){r=r;}
    public Circle(){r=1.0;}
    public Circle(int r){
        r=12;
    }
    
    public double circumference(){return 2*PI*r;}
    public double area(){return PI*r*r;}
    public static void main(String[] args) {
        Circle cir=new Circle();
        System.out.println("the circumecefence is  "+cir.circumference());
        System.out.println("the area of circle is  "+cir.area());

        
    }
}
