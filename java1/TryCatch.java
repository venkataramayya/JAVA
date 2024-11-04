public class TryCatch {
    public static void main(String[] args) {
        int a=10;
        int b=5;
try{
    int result=a/b;
    System.out.println(result);


}  
catch(ArithmeticException ae){
    System.out.println("it is an aritrmatic exception");


}   

    }
}
