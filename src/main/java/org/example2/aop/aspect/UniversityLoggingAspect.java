package org.example2.aop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.example2.aop.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("org.example2.aop.aspect.MyPointcuts.allGetStudentsMethods()")
    private void beforeGetStudentsAdvice(){
        System.out.println("beforeGetStudentsAdvice: логируем получение " +
                "списка студентов перед выполнением метода getStudents");
    }

    @AfterReturning(pointcut = "org.example2.aop.aspect.MyPointcuts.allGetStudentsMethods()",
    returning = "students")
    private void afterGetStudentsAdvice(List<Student> students){
        Student student = new Student("Now", 44, 23.2);
        students.add(student);

        System.out.println("afterGetStudentsAdvice: логируем получение " +
                "списка студентов после успешного выполнения метода getStudents");
    }
}
