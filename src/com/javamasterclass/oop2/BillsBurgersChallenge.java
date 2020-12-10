package com.javamasterclass.oop2;

class BaseBurger {
    private final String name;
    private final String bread;
    private final String meat;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean onions = false;
    private boolean mushrooms = false;
    private final double basePrice;
    private double grandTotal;
    private final double customItemPrice = .50;

    public BaseBurger(String name, String bread, String meat) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.basePrice = 10.00;
    }

    public double getSubTotal() {
        return grandTotal;
    }

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isOnions() {
        return onions;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public double getCustomItemPrice() {
        return customItemPrice;
    }

    private void addLettuce() {
        this.lettuce = true;
        grandTotal = +customItemPrice;
    }

    private void addTomato() {
        this.tomato = true;
        grandTotal += customItemPrice;
    }

    private void addOnions() {
        this.onions = true;
        grandTotal += customItemPrice;
    }

    private void addMushrooms() {
        this.mushrooms = true;
        grandTotal += customItemPrice;
    }

    public void addItems(boolean lettuce, boolean tomato, boolean onions, boolean mushrooms) {
        if (lettuce) {
            addLettuce();
        }
        if (tomato) {
            addTomato();
        }
        if (onions) {
            addOnions();
        }
        if (mushrooms) {
            addMushrooms();
        }
    }

    public String getGrandTotal() {
        String items = "";
        if (lettuce) {
            items += " lettuce $" + customItemPrice;
        }
        if (tomato) {
            items += " tomato $" + customItemPrice;
        }
        if (onions) {
            items += " onions $" + customItemPrice;
        }
        if (mushrooms) {
            items += " mushrooms $" + customItemPrice;
        }
        if (!lettuce && !tomato && !onions && !mushrooms) {
            grandTotal = basePrice;
            items = " no additional items";
        } else {
            grandTotal += basePrice;
        }
        return "Hamburger " + name + " with " + bread + " bread and " + meat + ". Base cost: $" + basePrice + " with"
                + items + ". Grand total $" + grandTotal;
    }
}

class HealthyBurger extends BaseBurger {
    private boolean cheese = false;
    private boolean sauce = false;
    private double subTotal;

    public HealthyBurger(String name, String meat) {
        super(name, "brown rye", meat);
    }

    private void addCheese() {
        this.cheese = true;
        subTotal += getCustomItemPrice();
    }

    private void addSauce() {
        this.sauce = true;
        subTotal += getCustomItemPrice();
    }

    public void addItems(boolean lettuce, boolean tomato, boolean onions, boolean mushrooms, boolean cheese, boolean sauce) {
        super.addItems(lettuce, tomato, onions, mushrooms);
        if (cheese) {
            addCheese();
        }
        if (sauce) {
            addSauce();
        }
    }

    public String getGrandTotal() {
        String items = "";
        if (isLettuce()) {
            items += " lettuce $" + getCustomItemPrice();
        }
        if (isTomato()) {
            items += " tomato $" + getCustomItemPrice();
        }
        if (isOnions()) {
            items += " onions $" + getCustomItemPrice();
        }
        if (isMushrooms()) {
            items += " mushrooms $" + getCustomItemPrice();
        }
        if (cheese) {
            items += " cheese $" + getCustomItemPrice();
        }
        if (sauce) {
            items += " sauce $" + getCustomItemPrice();
        }
        if (!isLettuce() && !isTomato() && !isOnions() && !isMushrooms() && !cheese && !sauce) {
            subTotal = getBasePrice();
            items = " no additional items";
        } else {
            subTotal += getBasePrice() + getSubTotal();
        }
        return "Hamburger " + getName() + " with " + getBread() + " bread and " + getMeat() + ". Base cost: $" + getBasePrice() + " with"
                + items + ". Grand total $" + subTotal;
    }
}

class DeluxeBurger extends BaseBurger {

    public DeluxeBurger(String name, String bread, String meat) {
        super(name, bread, meat);
    }

    public String getGrandTotal() {
        String items = "chips & drink $";
        double chipsAndDrinkCost = 4.0;
        double mealPrice = getBasePrice() + chipsAndDrinkCost;

        return "Hamburger " + getName() + " with " + getBread() + " bread and " + getMeat() + ". Base cost: $" + getBasePrice() + " with"
                + items + chipsAndDrinkCost + ". Grand total $" + mealPrice;
    }

}

public class BillsBurgersChallenge {
    public static void main(String[] args) {
        BaseBurger myBurger = new BaseBurger("Colosus", "white", "beef");
        System.out.println(myBurger.getGrandTotal());
        BaseBurger myBurger1 = new BaseBurger("Delux", "white", "beef");
        myBurger1.addItems(true, true, true, false);
        System.out.println(myBurger1.getGrandTotal());
        HealthyBurger myHealthyBurger = new HealthyBurger("Fufu", "turkey");
        myHealthyBurger.addItems(true, false, true, false, true, false);
        System.out.println(myHealthyBurger.getGrandTotal());
        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe meal", "wheat", "bison");
        System.out.println(deluxeBurger.getGrandTotal());
    }
}
