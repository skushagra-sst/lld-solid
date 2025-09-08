package com.example.notifications;

public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        base.notify("Baseline email only.");

        Notifier smsAndEmail = new SmsDecorator(base);
        smsAndEmail.notify("Build green ✅");

        Notifier full = new SlackDecorator(new WhatsAppDecorator(smsAndEmail));
        full.notify("Deployment completed 🚀");
    }
}
