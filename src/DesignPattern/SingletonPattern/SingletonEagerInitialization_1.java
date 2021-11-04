package DesignPattern.SingletonPattern;

/*
Eager Initialization
1) 클래스의 인스턴스를 클래스 로딩 단계에서 생성하는 방법
2) 해당 인스턴스를 사용하지 않더라도 인스턴스를 생성하므로 낭비 발생
 */
public class SingletonEagerInitialization_1 {
    private static final SingletonEagerInitialization_1 instance = new SingletonEagerInitialization_1();

    private SingletonEagerInitialization_1() {}

    public static SingletonEagerInitialization_1 getInstance() {
        return instance;
    }
}
