package DesignPattern.DecoratorPattern;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class Beverage {
    private String description;

    public abstract String getDescription();

    public abstract int cost();
}
