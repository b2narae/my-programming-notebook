package DesignPattern.DecoratorPattern;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public abstract class Beverage {
    private String description;
    public abstract String getDescription();
    public abstract int cost();
}
