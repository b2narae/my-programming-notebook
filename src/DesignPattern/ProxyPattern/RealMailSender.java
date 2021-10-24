package DesignPattern.ProxyPattern;

public class RealMailSender implements MailSender {

    @Override
    public void send(String message) {
        System.out.println("[SEND] : " + message);
    }
}
