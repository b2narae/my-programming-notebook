package DesignPattern.ObserverPattern;

import java.util.ArrayList;

public class Company implements Subject {

    private ArrayList<Observer> observers;
    private String url;
    private String content;

    public Company() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer ob : observers) {
            ob.update(url, content);
        }
    }

    public void messageChanged() {
        notifyObserver();
    }

    public void setMessage(String url, String content) {
        this.url = url;
        this.content = content;
        messageChanged();
    }
}
