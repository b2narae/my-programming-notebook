package DesignPattern.DecoratorPattern;

public class Espresso extends Beverage{
    private String description;

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int cost() {
        return 3500;
    }

}
