package com.example.notifications;

public class WhatsAppDecorator extends NotifierDecorator {

    public WhatsAppDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        sendWhatsAppNotification(message);
    }

    private void sendWhatsAppNotification(String message) {
        System.out.println("Sending WhatsApp notification: " + message);
    }

}
