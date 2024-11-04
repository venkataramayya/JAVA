package java2;
import java1.java2.Person;
public class Person {
    String name;
    int age;
    
    void birthday() {
        age++;
        System.out.println(name + " is now " + age);
    }
}
