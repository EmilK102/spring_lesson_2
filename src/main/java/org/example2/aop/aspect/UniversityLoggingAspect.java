package org.example2.aop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("org.example2.aop.aspect.MyPointcuts.allGetStudentsMethods()")
    private void beforeGetStudentsAdvice(){
        System.out.println("beforeGetStudentsAdvice: логируем получение " +
                "списка студентов перед выполнением метода getStudents");
    }

    @AfterReturning("org.example2.aop.aspect.MyPointcuts.allGetStudentsMethods()")
    private void afterGetStudentsAdvice(){
        System.out.println("afterGetStudentsAdvice: логируем получение " +
                "списка студентов после успешного выполнения метода getStudents");
    }
}
