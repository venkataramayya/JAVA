public class PassByValue {

    public static void main(String[] args) {
        int originalNumber = 10;
        modifyValue(originalNumber);
        System.out.println("After modification: " + originalNumber);
    }

    public static void modifyValue(int originalNumber) {
        originalNumber = 20; // This change is local to the method
    }
}

