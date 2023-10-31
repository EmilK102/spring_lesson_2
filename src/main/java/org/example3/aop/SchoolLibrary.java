package org.example3.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary {
    public String getBook(){
        int a = 10/0;
        System.out.println("SchoolLibrary.getBook()");
        return "Umniy";
    }

    public void returnBook(){
        System.out.println("SchoolLibrary.returnBook()");
    }

    public void addBook(){
        System.out.println("SchoolLibrary.addBook()");
    }

    public String getMagazine(){
        System.out.println("SchoolLibrary.getMagazine()");
        return "Nauka";
    }

    public void returnMagazine(){
        System.out.println("SchoolLibrary.returnMagazine()");
    }

    public void addMagazine(){
        System.out.println("SchoolLibrary.addMagazine()");
    }
}
