package DesignPattern.DecoratorPattern;

public class CoffeeStore {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();

        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.cost());
    }
}
