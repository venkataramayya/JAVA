  abstract class Vehicle{
    public abstract void car();
    public abstract  void bike();
    public void flights(){
        System.out.println("It can be fly");
    }
    
}

class Cars extends Vehicle{
    public void car(){
System.out.println("tis is bmw car");
    }

    public void bike(){
        System.out.println("this is tvs bike");

    }
}


public class Demos{
public static  void main(String args[]){
    Vehicle obj =new Cars();
    obj.car();
    obj.bike();
    obj.flights();
    
}
}