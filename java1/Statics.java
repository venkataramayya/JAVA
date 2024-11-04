public class Statics {
    int a;
    int b;
   static  String ch;

     void main(){
        System.out.println(a+" "+b+" "+ch);
    }
static void main1(Statics m1){
    System.out.println(m1.a+" "+m1.b+" "+ch);


}

    public static void main(String args[]){
        Statics m1=new Statics();
        m1.a=100;
        m1.b=1000;
        Statics.ch="hloo";

       Statics m2=new Statics();
       m2.ch="devi";

       m1.ch="sharmi";
m1.main();
main1(m1);

    }
}
