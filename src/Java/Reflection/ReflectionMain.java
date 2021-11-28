package Java.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// https://jg-seo.tistory.com/21
public class ReflectionMain {
    public static void main(String[] args) throws ClassNotFoundException {

        // 1. Method to get a class information
        Class anyClass = Class.forName("java.lang.String"); // ClassNotFoundException
        Class integerClass1 = int.class;
        Class integerClass2 = Integer.TYPE;

        System.out.println("Class.forName(\"java.lang.String\")" + anyClass.getName());

        // 2. Field Information
        Field[] fields = anyClass.getFields();

        for (Field f : fields) {
            System.out.println("\t" + f.getName());
        }

        // 3. Method Information
        Method[] declaredMethods = anyClass.getDeclaredMethods();

        System.out.println("Existing Method:");
        for (Method m : declaredMethods) {
            System.out.println("\t" + m.getName());
        }

        // 4. Constructor Information
        Constructor[] constructors = anyClass.getConstructors();

        System.out.println("Existing Constructor: ");
        for (Constructor c : constructors) {
            System.out.println("\t" + c.getName() + ", Param Count : " + c.getParameterCount());
        }

        // 5. Is the Same Class?
        boolean result = anyClass.isInstance(new String());
        System.out.println("IsSameClass ? : " + result);
    }
}
