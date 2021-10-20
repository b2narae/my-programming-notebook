package DesignPattern.AdapterPattern;

import java.io.NotActiveException;

public class Adapter {
    public static void example()  {
        throw new NumberFormatException();
    }

    public static void example2() throws NumberFormatException {
        throw new NumberFormatException();
    }
}
