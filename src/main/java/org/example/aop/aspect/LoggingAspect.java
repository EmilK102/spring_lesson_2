package org.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.example.aop.Book;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("org.example.aop.aspect.MyPointcuts.getAllUniLibraryMethods() || org.example.aop.aspect.MyPointcuts.returnAllUniLibraryMethods() || org.example.aop.aspect.MyPointcuts.addAllUniLibraryMethods()")
    public void beforeLoggingAdvice(JoinPoint joinPoint){
        System.out.println("    !beforeGetLoggingAdvice!");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature := " + methodSignature);
        System.out.println("methodSignature.getMethod() := " + methodSignature.getMethod());
        System.out.println("methodSignature.getName() := " + methodSignature.getName());
        System.out.println("methodSignature.getReturnType() := " + methodSignature.getReturnType());

        if(methodSignature.getName().equals("addBook")){
            Object[] objectsArgs = joinPoint.getArgs();
            for(Object object: objectsArgs){
                if (object instanceof Book){
                    Book book = (Book) object;
                    System.out.println("book.getYearOfPublish() " + book.getYearOfPublish());
                    System.out.println("book.getName() " + book.getName());
                } else if (object instanceof String) {
                    String user = (String) object;
                    System.out.println("user.name " + user);
                }
            }
        }
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
