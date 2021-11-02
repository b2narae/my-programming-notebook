package DesignPattern.SingletonPattern;

/*
inner static helper class

SingletonBillPugh 클래스가 로드될 때도 Load 되지 않고,
getInstance()가 호출될 때 JVM 메모리에 로드되고, 인스턴스를 생성함

synchronized를 사용하지 않기 때문에 성능 저하 또한 문제 없음.
그러나, Java 의 Reflection으로 싱글톤을 파괴할 수 있으며, Enum으로 싱글톤을 구현하는 방법이 있긴 함.

그러나 Enum으로 구현하는 방식은 많이 쓰이지 않음.
java.lang.reflect.Constructor라는 놈의 constructor.setAccessible(true)를 하면 break 됨
 */
public class SingletonBillPugh {
    private SingletonBillPugh() {}

    private static class SingletonHelper {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
