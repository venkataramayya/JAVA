public class OverLoad {

    void main1(int a){
        System.out.println("this is main1 method");
        System.out.println(a);
    }
    void main1(int a, int b){
        System.out.println("this is diffrent");
    }
    void main1(double a, double b, int v){
        System.out.println(a+""+b+""+a);
    }

    public static void main(String[] args) {
        OverLoad ol =new OverLoad();
        ol.main1(10);
        ol.main1(10,20 );
        ol.main1(10.0,20.0,10);
    }
}
