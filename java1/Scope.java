public class Scope {
    int x=10;
    public static void doSomething() {
        int x = 12;
        {
            x = 100;
            x=5;
            int q = 96;

            System.out.println(x + " " + q);
        }
        System.out.println(x);

    }

    public static void main(String args[]) {
        doSomething();
    }
}
