package org.example3.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        String book = schoolLibrary.getBook();
        String magazine = schoolLibrary.getMagazine();
        System.out.println("schoolLibrary.getBook(): " + book);
        System.out.println("schoolLibrary.getMagazine(): " + magazine);

        context.close();
    }
}
