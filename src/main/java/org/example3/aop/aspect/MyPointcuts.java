package org.example3.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyPointcuts {
    @Pointcut("execution(* get*())")
    public void allGetMethods(){}
}
