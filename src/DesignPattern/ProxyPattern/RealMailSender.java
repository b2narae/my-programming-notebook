package DesignPattern.ProxyPattern;

// 최종적으로 Mail을 보내는 객체
//
public class RealMailSender implements MailSender {

    @Override
    public void send(String message) {
        System.out.println("[SEND] : " + message);
    }
}
