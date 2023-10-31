package org.example2.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(){
        Student st1 = new Student("Zaza", 4, 4.5);
        Student st2 = new Student("Zuzu", 3, 4.5);
        Student st3 = new Student("Zizi", 2, 4.5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents");
//        try {
//            System.out.println(students.get(3));
//        }
//        catch (Exception e){
//            System.out.println("Выявленно исключение");
//        }
        System.out.println(students.get(3));
        return students;
    }
}
