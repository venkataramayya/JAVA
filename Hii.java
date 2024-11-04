class A {
    private int a;
    public A(int a) {
        this.a = a;
    }
}

class B extends A{
    private int b;
    public B(int a, int b) {
        super(a);
        this.b = b;
    }
}

class C extends B{
    private int c;
    public C(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }
}

public class Hii{
    public static void main( String args[])
    {
C obj=new C(0, 0, 0);       
    }
}


