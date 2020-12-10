package com.javamasterclass.oop1;

public class Main {
    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setModel("Carrera");
//        System.out.println("Model is " + porsche.getModel());

//        Account bobsAccount = new Account();

//        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "yes@yahoo.com",
//                "619-888-3016");
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//
//        Account timsAccount = new Account("Tim","tim@yahoo.com","12345");
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

//        VipPerson person1 = new VipPerson();
//        System.out.println(person1.getName());
//
//        VipPerson person2 = new VipPerson("Bob", 25000.00);
//        System.out.println(person2.getName());
//
//        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
//        System.out.println(person3.getName());

//        Point first = new Point(6,5);
//        Point second = new Point(3,1);
//        System.out.println(first.distance(2,2));
//        System.out.println(first.distance(second));
//        System.out.println(first.distance());

//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75,4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println(calculator.getTotalCost());

//        Animal animal = new Animal("Animal", 1,1, 5,5);
//        Dog dog = new Dog("Yorkie", 8,20,2,4,1,20, "long silky");
//        dog.eat();
//        dog.walk();
//        dog.run();

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
