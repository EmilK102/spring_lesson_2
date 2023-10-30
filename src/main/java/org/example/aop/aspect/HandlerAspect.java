package org.example.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class HandlerAspect {

    @Before("org.example.aop.aspect.MyPointcuts.getAllUniLibraryMethods() || org.example.aop.aspect.MyPointcuts.returnAllUniLibraryMethods() || org.example.aop.aspect.MyPointcuts.addAllUniLibraryMethods()")
    public void beforeHandlerAdvice(){
        System.out.println("    !beforeHandlerAdvice!");
    }
}
