package DesignPattern.SingletonPattern;

/*
get Instance 진입 쓰레드가 하나로 보장되어 멀티 스레드에서도 잘 동작하나,
키워드에 대한 비용이 커서 인스턴스 호출이 잦은 어플리케이션에서는 성능이 떨어짐

method 앞에 synchronized를 붙이면, 해당 객체 내부의 변수나 메소드 사용 불가
 */

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {}

    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}
