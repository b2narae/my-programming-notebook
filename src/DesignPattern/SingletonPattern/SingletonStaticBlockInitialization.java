package DesignPattern.SingletonPattern;

/*
Eager Initialization과 달리, static block을 통해 Exception Handling 가능
 */

public class SingletonStaticBlockInitialization {
    private static SingletonStaticBlockInitialization instance;

    private SingletonStaticBlockInitialization() {}

    static {
        try {
            instance = new SingletonStaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception Occurred");
        }
    }

    public static SingletonStaticBlockInitialization getInstance() {
        return instance;
    }
}
