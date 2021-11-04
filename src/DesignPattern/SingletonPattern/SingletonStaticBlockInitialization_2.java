package DesignPattern.SingletonPattern;

/*
Eager Initialization과 달리, static block을 통해 Exception Handling 가능
*/

public class SingletonStaticBlockInitialization_2 {
    private static SingletonStaticBlockInitialization_2 instance;

    private SingletonStaticBlockInitialization_2() {}

    static {
        try {
            instance = new SingletonStaticBlockInitialization_2();
        } catch (Exception e) {
            throw new RuntimeException("Exception Occurred");
        }
    }

    public static SingletonStaticBlockInitialization_2 getInstance() {
        return instance;
    }
}
