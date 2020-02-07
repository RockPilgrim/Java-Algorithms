public abstract class AbstractTest {


    public abstract void lol();

    private void dot() {

    }

    public static void soda() {

    }

    public static int soda(int f, float d) {
        return 0;
    }

    public static int soda(float d, int f) {
        return 0;
    }
}

class Vehicle {
    public static void kmToMiles(int km) {
        System.out.println("Внутри родительского класса/статического метода");
    }
}

class Car extends Vehicle {

    public static void kmToMiles(int km) {
        System.out.println("Внутри дочернего класса/статического метода ");
    }
}

class Demo {
    public static void main(String args[]) {
        Vehicle v = new Car();
        v.kmToMiles(10);
        Car d = new Car();
        d.kmToMiles(2);
    }
}
