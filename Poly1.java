class Animal{
    public void sound(){
        System.out.println("animals make sound");
    }
}
class Dog extends Animal {
    @Override
    public void sound(){
        System.out.println("dogs make sound bow......bow");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("cat make sound meow...meow");
    }
}




public class Poly1 {
    public static void main(String[] args) {
        Animal obj=new Animal();
        Animal obj1=new Dog();
        Animal obj2=new Cat();
        obj.sound();
        obj1.sound();

        obj2.sound();

    }
    
}
