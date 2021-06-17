package com.patterns.factory_method;

public class PushNotification implements Notification {

    @Override
    public String notifyUser() {
        return "Sending a push notification";
    }

}
