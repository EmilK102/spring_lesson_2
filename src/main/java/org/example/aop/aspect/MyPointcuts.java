package org.example.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyPointcuts {

    @Pointcut("execution(public void get*(..))")
    public void getAllUniLibraryMethods(){}

    @Pointcut("execution(public void return*())")
    public void returnAllUniLibraryMethods(){}

    @Pointcut("execution(public void add*(..))")
    public void addAllUniLibraryMethods(){}
}
