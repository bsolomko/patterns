package com.patterns.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationFactoryTest {

    @Test
    void SMSNotificationTest() {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        assertEquals("Sending an SMS notification", notification.notifyUser());
    }

    @Test
    void EmailNotificationTest() {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("EMAIL");
        assertEquals("Sending an e-mail notification", notification.notifyUser());
    }

    @Test
    void PushNotificationTest() {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("PUSH");
        assertEquals("Sending a push notification", notification.notifyUser());
    }

}
