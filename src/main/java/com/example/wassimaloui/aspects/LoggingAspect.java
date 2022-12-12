package com.example.wassimaloui.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    // après le bon déroulement => @AfterReturning
    @AfterReturning("execution(void com.example.wassimaloui.controllers*.*(..))")
    public void logMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("out of method  :" + name);
    }
}




