package hello.services;

import hello.builder.Wrapper;

/**
 * Created by Maciej Rudnicki on 29/12/2016.
 */
public class SmsServiceImpl implements SmsService {

    public void sendSms(Wrapper wrapper) {
        System.out.println("sending sms.....");
    }
}
