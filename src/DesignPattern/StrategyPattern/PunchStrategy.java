package DesignPattern.StrategyPattern;

public class PunchStrategy implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("punch");
    }
}
