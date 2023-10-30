package org.example.aop;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary extends abstractLibrary{
    @Override
    public void getBook() {
        System.out.println("getBook from UniLibrary");
    }

    public void returnBook(){
        System.out.println("returnBook from UniLibrary");
    }
}
