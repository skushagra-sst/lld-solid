package services.email;

public class SimpleEmailClient implements EmailClient {

    @Override
    public void send(String to, String body) {
        System.out.println("[EMAIL to=" + to + "] " + body);
    }
}