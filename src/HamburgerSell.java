public class HamburgerSell {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "White bread", "Beef");
        double price = hamburger.itemizeHamburger();
        hamburger.addAddition1("Onion", 5.50);
        hamburger.addAddition2("Cheese", 7.0);
        System.out.println("Price with additions is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Rabbit");
        healthyBurger.addHealthyAddition1("Sauce", 0.75);
        healthyBurger.addHealthyAddition2("Tomatoes", 1);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
    }
}

class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String addition1;
    private double addition1Price;

    private String addition2;
    private double addition2Price;

    private String addition3;
    private double addition3Price;

    private String addition4;
    private double addition4Price;

    public Hamburger(String name, String breadRollType, String meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 10;
    }

    public void addAddition1(String name, double price) {
        this.addition1 = name;
        this.addition1Price = price;
    }

    public void addAddition2(String name, double price) {
        this.addition2 = name;
        this.addition2Price = price;
    }

    public void addAddition3(String name, double price) {
        this.addition3 = name;
        this.addition3Price = price;
    }
    public void addAddition4(String name, double price) {
        this.addition4 = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.breadRollType +
                " with meat " + this.meat + " price is " + this.price);
        if (this.addition1 != null){
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1 + " with price = " + this.addition1Price);
        }
        if (this.addition2 != null){
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2 + " with price = " + this.addition2Price);
        }
        if (this.addition3 != null){
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3 + " with price = " + this.addition3Price);
        }
        if (this.addition4 != null){
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4 + " with price = " + this.addition4Price);
        }
        return hamburgerPrice;
    }

}

class HealthyBurger extends Hamburger{

    private String healthyAddition1Name;
    private double healthyAddition1Price;

    private String healthyAddition2Name;
    private double healthyAddition2Price;

    public HealthyBurger(String meat) {
        super("Healthy", "Brown rye", meat);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyAddition1Name = name;
        this.healthyAddition1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyAddition2Name = name;
        this.healthyAddition2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburger = super.itemizeHamburger();
        if (this.healthyAddition1Name != null){
            hamburger += this.healthyAddition1Price;
            System.out.println("Added " + this.healthyAddition1Name + " with price " +
                    this.healthyAddition1Price);
        }
        if (this.healthyAddition2Name != null){
            hamburger += this.healthyAddition2Price;
            System.out.println("Added " + this.healthyAddition2Name + " with price " +
                    this.healthyAddition2Price);
        }
        return hamburger;
    }
}

class DeluxeBurger extends Hamburger{
    public DeluxeBurger (){
        super("Deluxe", "Sausage & Bacon", "Pork");
        super.addAddition1("Chips", 1.25);
        super.addAddition2("Drink", 1.80);
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("Cannot ad additions to Deluxe");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Cannot ad additions to Deluxe");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Cannot ad additions to Deluxe");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Cannot ad additions to Deluxe");
    }
}