package DesignPattern.CommandPattern;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Alarm alarm = new Alarm();
        Command alarmStartCommand = new AlarmStartCommand(alarm);

        // lamp, alarm 등과 같은 다양한 동작을 구현 가능
        // -> 즉 코드 확장이 용이해짐.
        // 이는 AlarmStartCommand와 LampOnCommand라는 Command를 만들었기 때문에 가능.
        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        Button button2 = new Button(alarmStartCommand);
        button2.pressed();
        button2.setCommand(lampOnCommand);
        button2.pressed();
    }
}
