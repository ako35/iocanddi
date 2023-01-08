package com.tpe.service;

import com.tpe.domain.Message;

public class MailService implements MessageService{

    public void sendMessage(Message message){
        System.out.println("ben mail servisiyim, size mesaj gonderiyorum: "+message.getMessage());
    }
}
