package hello.services;

import hello.builder.Wrapper;

/**
 * Created by Maciej Rudnicki on 30/12/2016.
 */
public interface SmsService {

    void sendSms(Wrapper wrapper);
}
