package com.example.notifications;

public class SlackDecorator extends NotifierDecorator {

    public SlackDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        sendSlackNotification(message);
    }

    private void sendSlackNotification(String message) {
        System.out.println("Sending Slack notification: " + message);
    }

}
