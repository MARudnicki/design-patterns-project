package hello;

import hello.proxy.SmsProxy;
import hello.services.SmsService;
import hello.services.SmsServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Proxy;


@SpringBootApplication
@Configuration
@ComponentScan("hello")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public SmsService smsService(){
        return (SmsService) Proxy.newProxyInstance(SmsService.class.getClassLoader(),
                new Class[] { SmsService.class },
                new SmsProxy(new SmsServiceImpl()));
    }
}
