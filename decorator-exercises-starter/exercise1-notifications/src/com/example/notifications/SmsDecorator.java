package com.example.notifications;

public class SmsDecorator extends NotifierDecorator {

    public SmsDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        sendSMSNotification(message);
    }

    private void sendSMSNotification(String message) {
        System.out.println("Sending SMS notification to: " + message);
    }

}
