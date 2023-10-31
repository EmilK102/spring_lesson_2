package org.example2.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyPointcuts {

    @Pointcut("execution(* getStudents())")
    public void allGetStudentsMethods(){}
}
