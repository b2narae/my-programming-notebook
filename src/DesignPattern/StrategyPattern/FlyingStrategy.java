package DesignPattern.StrategyPattern;

public class FlyingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("Fly");
    }
}
