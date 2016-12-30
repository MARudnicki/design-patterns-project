package hello.fasade;

import hello.builder.Wrapper;
import hello.services.MailService;
import hello.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Maciej Rudnicki on 29/12/2016.
 */
@Component
public class NotificationFasade {

    @Autowired
    public NotificationFasade(MailService mailService, SmsService smsService) {
        this.mailService = mailService;
        this.smsService = smsService;
    }

    private MailService mailService;

    private SmsService smsService;

    public void sendNotification(Wrapper wrapper) {

        mailService.sendMail(wrapper);

        smsService.sendSms(wrapper);

    }

}
