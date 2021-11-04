package DesignPattern.SingletonPattern;

/*
Singleton Thread Safe의 방식처럼 method 전체에 Synchronized를 걸지 않고,
if (instance == null) 일때만, class에 Synchronized를 건다.
이렇게 되면 getInstance를 호출할 때 항상, Synchronized 일 필요가 없으므로 성능상 유리함.

이 경우 instance에 volatile을 사용해야 한다.
메인 메모리와 working 메모리 사이의 동기화가 안되어 있으므로, volatile을 사용해야 방지 가능 
 */

public class SingletonDoubleCheckedLocking_5 {
    private static SingletonDoubleCheckedLocking_5 instance;

    private SingletonDoubleCheckedLocking_5() {};

    public static SingletonDoubleCheckedLocking_5 getInstance() {
        if (instance == null) { // null 인 경우만 들어오는 용도
            synchronized (SingletonDoubleCheckedLocking_5.class) {
                if (instance == null) { // 하나만 생성되게 막는 용도
                    instance = new SingletonDoubleCheckedLocking_5();
                }
            }
        }
        return instance;
    }
}
