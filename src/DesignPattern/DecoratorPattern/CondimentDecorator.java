package DesignPattern.DecoratorPattern;

// 추상클래스는 추상메소드 없이도 선언될 수 있음
// 추상클래스는 다른 추상클래스를 상속할 수 있음
// Decorator 클래스는 Component에 대한 Reference Instance를 갖고 있어야 함
public abstract class CondimentDecorator extends Beverage{
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
