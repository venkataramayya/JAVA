public class This {
    private int a;
    String name;
    public  void main(int a,String name){
        this.a=a;
        this.name=name;
        System.out.println(a+" " +name);

    }
    public static void main(String args[]){
This ap=new This();
ap.main(10,"venkat");
    }
    
}
