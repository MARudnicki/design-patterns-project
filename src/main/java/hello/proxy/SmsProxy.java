package hello.proxy;

import hello.services.SmsService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SmsProxy implements InvocationHandler{

    private final SmsService original;

    public SmsProxy(SmsService original) {
        this.original = original;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws IllegalAccessException, IllegalArgumentException,
            InvocationTargetException {
        System.out.println("PROXY PREPARE SMS");
        method.invoke(original, args);
        System.out.println("PROXY AFTER SENT SMS");
        return null;
    }
}