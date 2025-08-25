package services.email;

public interface EmailClient {

    public void send(String to, String body);

}
