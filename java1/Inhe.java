class Inher {
    void main1(){
        System.out.println("hloo this is venkat");
    }
}
class B extends Inher{
    void main1(){
        System.out.println("hloo!, this is venkat");
    }
}

public class Inhe{
    public static void main(String[] args) {
        
        Inher in=new Inher();
        in.main1();
        Inher in1=new B();
        in1.main1();        
    }
}

