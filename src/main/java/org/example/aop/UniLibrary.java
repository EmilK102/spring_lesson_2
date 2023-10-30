package org.example.aop;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary extends abstractLibrary{
    @Override
    public void getBook() {
        System.out.println("getBook from UniLibrary");
    }

    @Override
    public void getMagazine(){
        System.out.println("getMagazine from UniLibrary");
    }

    @Override
    public void returnBook(){
        System.out.println("returnBook from UniLibrary");
    }

    @Override
    public void returnMagazine(){
        System.out.println("returnMagazine from UniLibrary");
    }

    @Override
    public void addBook() {
        System.out.println("addBook from UniLibrary");
    }

    @Override
    public void addMagazine() {
        System.out.println("addMagazine from UniLibrary");
    }
}
