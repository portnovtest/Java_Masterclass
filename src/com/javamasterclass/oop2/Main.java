package com.javamasterclass.oop2;


public class Main {
    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//        Monitor theMonitor = new Monitor("27inch beast", "Acer", 27, new Resolution(2540, 1440));
//        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.powerUp();

//        Windows theWindow = new Windows(22, 22, "glass", false);
//        Door theDoor = new Door(false, 22, 60);
//        Table theTable = new Table("dining", 4, false);
//        Bed theBed = new Bed("Queen", 22, 60, 4);
//
//        Room theRoom = new Room("My room", theWindow, theDoor, theBed, theTable);
//        theRoom.openTheDoor();
//        theRoom.getWindow().openWindow();

//        Wallz wall1 = new Wallz("West");
//        Wallz wall2 = new Wallz("East");
//        Wallz wall3 = new Wallz("South");
//        Wallz wall4 = new Wallz("North");
//        Ceiling ceiling = new Ceiling(12, 55);
//        Bedd bed = new Bedd("Modern", 4, 3, 2, 1);
//        Lamp lamp = new Lamp("Classic", false, 75);
//
//        Bedroom bedroom = new Bedroom("Phils", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
//        bedroom.makeBed();
//        bedroom.getLamp().turnOn();

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
//        System.out.println("Initial health is  " + player.getHitPoints());
//        Printer printer = new Printer(5);
//        printer.printPages(5, false);
//        PrinterOne printer = new PrinterOne(50, false);
//        System.out.println("initial page count = " + printer.getPagesPrinted());
//        int pagesPrinted = printer.printPages(4);
//        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
//        pagesPrinted = printer.printPages(2);
//        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", .27);
        hamburger.addHamburgerAddition2("Lettuce", .75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyHamburger healthyHamburger = new HealthyHamburger("Bacon", 5.67);
        healthyHamburger.addHamburgerAddition1("Egg", 5.43);
        healthyHamburger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Hamburger price is " + healthyHamburger.itemizeHamburger());

        DeluxeHamburger db = new DeluxeHamburger();
        System.out.println("Total Deluxe Hamburger price is " + db.itemizeHamburger());
    }
}
