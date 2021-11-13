package Java.Reflection;

import java.lang.reflect.Field;

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




    }
}
