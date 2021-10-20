package DesignPattern.ObserverPattern;

public class Subscriber implements Observer, DisplayElement {

    private Subject company;
    private String url;
    private String content;

    public Subscriber(Subject company) {
        this.company = company;
        company.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현 구독자");
        System.out.println("url : " + url);
        System.out.println("content : " + content);
    }

    @Override
    public void update(String url, String content) {
        this.url = url;
        this.content = content;
        display();
    }
}
