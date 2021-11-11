package DesignPattern.CommandPattern;

// execute를 상속하는 다양한 기능들 : AlarmStartCommand, LampOnCommand
public interface Command {
    public abstract void execute();
}
