package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//ProxySimple class 대신 프록시기반의 Aop 작동

@Component
@Aspect
public class PerfAspect {

    @Around("@annotation(PerfLogging)")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable{

        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();

        System.out.println(System.currentTimeMillis() - begin );

        return retVal;

    }

}
