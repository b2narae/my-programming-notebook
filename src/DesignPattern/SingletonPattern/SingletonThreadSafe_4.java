package DesignPattern.SingletonPattern;

/*
get Instance 진입 쓰레드가 하나로 보장되어 멀티 스레드에서도 잘 동작하나,
키워드에 대한 비용이 커서 인스턴스 호출이 잦은 어플리케이션에서는 성능이 떨어짐

method 앞에 synchronized를 붙이면, 그 method를 호출한 객체를 기준으로 lock을 잡음
 */

public class SingletonThreadSafe_4 {
    private static SingletonThreadSafe_4 instance;

    private SingletonThreadSafe_4() {}

    public static synchronized SingletonThreadSafe_4 getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafe_4();
        }
        return instance;
    }
}
