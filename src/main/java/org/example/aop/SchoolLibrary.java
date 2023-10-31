package org.example.aop;

import org.springframework.stereotype.Component;

@Component()
public class SchoolLibrary extends abstractLibrary{

    public void getBook(String user, Book book) {
        System.out.println("getBook from SchoolLibrary");
        System.out.println("_______________________________");
    }
    public void getMagazine(){
        System.out.println("getMagazine from SchoolLibrary");
        System.out.println("_______________________________");
    }
    public void returnBook(){
        System.out.println("returnBook from SchoolLibrary");
        System.out.println("_______________________________");
    }
    public void returnMagazine(){
        System.out.println("returnMagazine from SchoolLibrary");
        System.out.println("_______________________________");
    }

    public void addBook(String user, Book book) {
        System.out.println("addBook from SchoolLibrary");
        System.out.println("_______________________________");
    }

    public void addMagazine() {
        System.out.println("addMagazine from SchoolLibrary");
        System.out.println("_______________________________");
    }
}
