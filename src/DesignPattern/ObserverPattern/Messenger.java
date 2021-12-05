package DesignPattern.ObserverPattern;

public class Messenger {
    public static void main(String[] args) {
        Company company = new Company();
        Subscriber subscriber = new Subscriber(company);

        company.setMessage("photo", "new event");
        System.out.println(company.hashCode());
    }
}
