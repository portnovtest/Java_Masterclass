package com.javamasterclass.oop2;

class Cars {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Cars(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }


}

class Jaguar extends Cars {
    public Jaguar(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> bake()";
    }
}

class Mitsubishi extends Cars {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> bake()";
    }
}

class Ford extends Cars {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> bake()";
    }
}


public class PolymorphismChallenge {
    public static void main(String[] args) {
        Cars cars = new Cars(8, "Base car");
        System.out.println(cars.startEngine());
        System.out.println(cars.accelerate());
        System.out.println(cars.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRM 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Jaguar jaguar = new Jaguar(8, "The Jag");
        System.out.println(jaguar.startEngine());
        System.out.println(jaguar.accelerate());
        System.out.println(jaguar.brake());

    }
}
