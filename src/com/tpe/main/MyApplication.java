package com.tpe.main;

import com.tpe.domain.Message;
import com.tpe.service.MailService;
import com.tpe.service.MessageService;
import com.tpe.service.SmsService;
import com.tpe.service.WhatsAppService;

public class MyApplication {

    public static void main(String[] args) {

        Message message=new Message();
        message.setMessage("siparisler kargoya verildi.");

        // 1. asama
//        MailService mailService=new MailService();
//        mailService.sendMessage(message);
//
//        SmsService smsService=new SmsService();
//        smsService.sendMessage(message);
//
//        WhatsAppService whatsAppService=new WhatsAppService();
//        whatsAppService.sendMessage(message);

        // 2. asama
        String serviceName="mailService";
        MessageService service;

        if (args.length>0){
            serviceName=args[0];
        }

        if (serviceName.equalsIgnoreCase("whatsAppService")){
            service=new WhatsAppService();
        } else if (serviceName.equalsIgnoreCase("smsService")) {
            service=new SmsService();
        } else service=new MailService();

        service.sendMessage(message);


    }
}
