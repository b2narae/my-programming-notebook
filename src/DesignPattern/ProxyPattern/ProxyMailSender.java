package DesignPattern.ProxyPattern;

import java.util.Objects;

public class ProxyMailSender implements MailSender {
    private MailSender mailSender = null;

    public ProxyMailSender() {}

    @Override
    public void send(String message) {
        if (Objects.isNull(mailSender)) {
            mailSender = new RealMailSender();
        }
        System.out.println("Proxy before process");
        mailSender.send(message);
        System.out.println("Proxy after process");
    }
}
