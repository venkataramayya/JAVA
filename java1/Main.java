package java2;
import java2.Person;

class Main {
    public static void main(String[] args) {
        Person john = new Person();
        john.name = "John Smith";
        john.age = 37;

        Person mary = new Person();
        mary.name = "Mary Brown";
        mary.age = 33;

        mary.birthday();
        
    }
}
