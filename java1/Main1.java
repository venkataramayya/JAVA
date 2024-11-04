public class Main1 {
    public static void main(String[] args) {
        PassByReference john = new PassByReference("John Smith");
        modifyPerson(john);
        System.out.println(john.name); // Output: Jane Doe
    }

    public static void modifyPerson(PassByReference person) {
        person.name = "Jane Doe"; // This modifies the original object's state
    }
}
