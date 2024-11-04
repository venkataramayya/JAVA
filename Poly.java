public class Poly {
    int a;
    int b;
    int c;

public void add(int a,int b){
    this.a=a;
    this.b=b;
System.out.println(a+b);

}

public void add(int a){
    this.a=a;
    System.out.println(a);
}

public void add(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;

System.out.println(a*b*c);
}

public static void main(String[] args){
    Poly obj=new Poly();
    obj.add(10);
    obj.add(10,20,30);
    obj.add(10,20);

}

}
