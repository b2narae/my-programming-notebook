package DesignPattern.SingletonPattern;

/*
Singleton Thread Safe의 방식처럼 method 전체에 Synchronized를 걸지 않고,
if (instance == null) 일때만, class에 Synchronized를 건다.
이렇게 되면 getInstance를 호출할 때 항상, Synchronized 일 필요가 없으므로 성능상 유리함.
 */

public class SingletonDoubleCheckedLocking {
    private static SingletonDoubleCheckedLocking instance;

    private SingletonDoubleCheckedLocking() {};

    public static SingletonDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
