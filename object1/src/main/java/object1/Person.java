package object1;

// Define a class
class Person {
    // Define Instance Variables
    // different for each object!
    String name;
    int age = 0;
    //The units for height are in "centimeters"
    int height;
    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        height = 0;
    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("John", 30, 60);

        /* Now you can use the Object `person1` */
        System.out.println("The height is: " + person1.height + "cm");
    }
}

