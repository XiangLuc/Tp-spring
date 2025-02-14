package com.tpspring.utils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggerAspect {

    @Before("execution(public * com.tpspring.services.AnnonceService.*(..))")
    public void log() {
        System.out.println("Appel de fonction.");
    }
}