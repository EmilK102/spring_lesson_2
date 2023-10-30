package org.example.aop;

import org.springframework.stereotype.Component;

@Component()
public class SchoolLibrary extends abstractLibrary{
    @Override
    public void getBook() {
        System.out.println("getBook from SchoolLibrary");
    }

    public void getMoney(){
        System.out.println("getMoney from SchoolLibrary");
    }
}
