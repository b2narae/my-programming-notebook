package DesignPattern.CompositePattern;

public class Client {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard(50000, 2);

        Computer computer = new Computer();
        computer.addComponent(keyboard);

        int computerPrice = computer.getPrice();
        int computerPower = computer.getPower();
        System.out.println("Computer Price : " + computerPrice);
        System.out.println("Computer Power : " + computerPower);
    }
}
