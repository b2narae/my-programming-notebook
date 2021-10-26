package DesignPattern.StrategyPattern;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV ("TaekwonV");
        Robot atom = new Atom ("Atom");

        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new MissileStrategy());
        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());
    }
}
