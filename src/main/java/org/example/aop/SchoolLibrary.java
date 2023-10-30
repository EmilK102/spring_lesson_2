package org.example.aop;

import org.springframework.stereotype.Component;

@Component()
public class SchoolLibrary extends abstractLibrary{
    @Override
    public void getBook() {
        System.out.println("getBook from SchoolLibrary");
    }
    @Override
    public void getMagazine(){
        System.out.println("getMagazine from SchoolLibrary");
    }
    @Override
    public void returnBook(){
        System.out.println("returnBook from SchoolLibrary");
    }
    @Override
    public void returnMagazine(){
        System.out.println("returnMagazine from SchoolLibrary");
    }

    @Override
    public void addBook() {
        System.out.println("addBook from SchoolLibrary");
    }

    @Override
    public void addMagazine() {
        System.out.println("addMagazine from SchoolLibrary");
    }
}
