package P10;

public class Human {
    String name; int age;
    // Constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        // instance object
        Human jimon = new Human("warawut", 20);
        Human earn = new Human("Thidatrip", 20);

//        jimon.name = "warawut";
//        jimon.age = 20;
        System.out.println("Human Name is " + jimon.name);
        System.out.println("Human Age is " + jimon.age);
        System.out.println("Human Name is " + earn.name);
        System.out.println("Human Age is " + earn.age);
    }

}
