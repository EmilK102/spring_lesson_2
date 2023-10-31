package org.example3.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Around("org.example3.aop.aspect.MyPointcuts.allGetMethods()")
    private Object aroundReturnGetLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("LoggingAspect.aroundReturnBookLoggingAdvice() start");
        long start = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch (Exception e){
            System.out.println("LoggingAspect.aroundReturnBookLoggingAdvice() exception " + e);
            throw e;
        }
        long stop = System.currentTimeMillis();
        System.out.println("LoggingAspect.aroundReturnBookLoggingAdvice() end");
        System.out.println("Time: " + (stop-start) + " ms" );
        return targetMethodResult;
    }
}
