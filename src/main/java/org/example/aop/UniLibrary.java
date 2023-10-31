package org.example.aop;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary extends abstractLibrary{
    public void getBook(String user, Book book) {
        System.out.println("getBook from UniLibrary");
        System.out.println("_______________________________");
    }

    public void getMagazine(){
        System.out.println("getMagazine from UniLibrary");
        System.out.println("_______________________________");
    }

    public void returnBook(){
        System.out.println("returnBook from UniLibrary");
        System.out.println("_______________________________");
    }

    public void returnMagazine(){
        System.out.println("returnMagazine from UniLibrary");
        System.out.println("_______________________________");
    }

    public void addBook(String user, Book book) {
        System.out.println("addBook from UniLibrary");
        System.out.println("_______________________________");
    }

    public void addMagazine() {
        System.out.println("addMagazine from UniLibrary");
        System.out.println("_______________________________");
    }
}
