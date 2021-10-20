package DesignPattern.ObserverPattern;

public class Messenger {
    public static void main(String[] args) {
        Company company = new Company();
        Subscriber subscriver = new Subscriber(company);

        company.setMessage("photo", "new event");
    }
}
