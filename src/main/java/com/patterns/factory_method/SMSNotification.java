package com.patterns.factory_method;

public class SMSNotification implements Notification {

    @Override
    public String notifyUser() {
        return "Sending an SMS notification";
    }

}
