package com.tpe.service;

import com.tpe.domain.Message;

public class SmsService implements MessageService{

    public void sendMessage(Message message){
        System.out.println("ben sms servisiyim, size mesaj gonderiyorum: "+message.getMessage());
    }
}
