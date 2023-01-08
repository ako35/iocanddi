package com.tpe.service;

import com.tpe.domain.Message;

public class WhatsAppService implements MessageService{

    public void sendMessage(Message message){
        System.out.println("Ben whatsapp servisiyim, size mesaj gonderiyorum: "+message.getMessage());
    }
}
