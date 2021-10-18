package DesignPattern.SingletonPattern;

/*
Eager Initialization과 달리 getInstance 호출시 초기화 함
Lazy Initialization은 single-thread 환경이 보장된 경우에만 사용할 것

(장점) instance 낭비를 막음
(단점) multi-thread 환경에서의 동기화 작업을 처리하지 못함
 */
public class SingletonLazyInitialization {
    private static SingletonLazyInitialization instance;

    private SingletonLazyInitialization() {}

    public static SingletonLazyInitialization getInstance() {
        if (instance == null) {
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }
}
