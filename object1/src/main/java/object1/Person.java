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
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = 0;
    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("John", 30);

        /* Now you can use the Object `person1` */
        System.out.println("The height is: " + person1.height + "cm");

        Person[] people = new Person[5];
        Person person2 = new Person("Mary", 35);
        Person person3 = new Person("Charles", 65);
        Person person4 = new Person("Susan", 22);

        Person person5 = new Person("Bob", 30);

        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;
        people[4] = person5;



    }
}

