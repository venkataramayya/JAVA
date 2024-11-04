class Super {
    public Super() {
        System.out.println("this is supers");
    }

    public Super(int a) {
        System.out.println("hii this is venkat");
    }
}

class B extends Super {
    public B() {
        super();
        System.out.println("this is b class");
    }

    public B(int a) {
        super(a);
        System.out.println("this is rams");
    }
}

public class Demo{
    public static void main(String args[]) {
        B obj = new B();
        B obj1 = new B(10);
    }
}
