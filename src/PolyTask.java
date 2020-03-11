public class PolyTask {
    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Volvo volvo = new Volvo(4, "XC60");
        System.out.println(volvo.startEngine());
        System.out.println(volvo.accelerate());
        System.out.println(volvo.brake());
    }
}

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Engine starts";
    }

    public String accelerate(){
        return "Accelerate is going";
    }

    public String brake(){
        return "Brakes are in";
    }
}

class Volvo extends Car {
    public Volvo(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        return "Engine starts on " + getClass().getSimpleName();
    }

    public String accelerate(){
        return "Accelerate is going on Volvo";
    }

    public String brake(){
        return "Brakes are in on Volvo";
    }
}

class VW extends Car {
    public VW(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        return "Engine starts on VW";
    }

    public String accelerate(){
        return "Accelerate is going on VW";
    }

    public String brake(){
        return "Brakes are in on VW";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        return "Engine starts on Ford";
    }

    public String accelerate(){
        return "Accelerate is going on Ford";
    }

    public String brake(){
        return "Brakes are in on Ford";
    }
}
