package hello.services;

import hello.builder.Wrapper;
import org.springframework.stereotype.Component;

/**
 * Created by Maciej Rudnicki on 29/12/2016.
 */
@Component
public class MailService {

    public void sendMail(Wrapper wrapper) {
        System.out.println("sending mail.....");
    }
}
