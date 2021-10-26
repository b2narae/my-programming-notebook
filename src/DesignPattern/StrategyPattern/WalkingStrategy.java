package DesignPattern.StrategyPattern;

public class WalkingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("walk");
    }
}
