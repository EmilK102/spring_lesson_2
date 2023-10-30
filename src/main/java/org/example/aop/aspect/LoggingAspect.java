package org.example.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("org.example.aop.aspect.MyPointcuts.getAllUniLibraryMethods() || org.example.aop.aspect.MyPointcuts.returnAllUniLibraryMethods() || org.example.aop.aspect.MyPointcuts.addAllUniLibraryMethods()")
    public void beforeLoggingAdvice(){
        System.out.println("    !beforeGetLoggingAdvice!");
    }


//    @Before("getAllUniLibraryMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("!beforeGetLoggingAdvice! UniLibrary");
//    }
//
//    @Before("getAllUniLibraryMethods()")
//    public void beforeGetCheckAdvice(){
//        System.out.println("!beforeGetCheckAdvice! UniLibrary");
//    }
}
