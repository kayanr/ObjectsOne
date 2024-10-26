package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

    Car car1 = new Car("Ford", "F150", 1990, 1000);
        System.out.println(car1.getMake());
    Dog dog1 = new Dog("Fluff", 11, "Poodle") ;
        System.out.println(dog1.getName());
    Chair chair1 = new Chair("wood", "brown", 4) ;
        System.out.println(chair1.getMaterial());
    Person person6 = new Person("Bob", 80) ;
        System.out.println(person6.name + " is " + person6.age);
    }
}
