package DesignPattern.ProxyPattern;

import java.util.Objects;

// ProxyMailSender가 MailSender를 감싸서, 그 역할을 대신 진행해 줌.
// MailSender를 상속하고, MailSender 인스턴스를 하나 갖고 있음.
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
