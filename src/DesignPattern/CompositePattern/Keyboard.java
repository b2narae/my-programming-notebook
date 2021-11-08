package DesignPattern.CompositePattern;

// ComputerDevice의 종류 중 하나
// Keyboard 외에도 모니터, 본체 등이 올 수 있음.
public class Keyboard extends ComputerDevice {
    private int price;
    private int power;

    public Keyboard(int price, int power) {
        this.price = price;
        this.power = power;
    }
    public int getPrice() {
        return price;
    }
    public int getPower() {
        return power;
    }
}
