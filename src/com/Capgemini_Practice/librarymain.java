package com.Capgemini_Practice;

import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;
    String ISBN;
    boolean isAvailable;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;

    }

    public boolean checkAvailability() {
        return isAvailable;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void borrowBook(){
        if(!isAvailable){
            System.out.println("Sorry, the book is not available.");
        }else{
            isAvailable = false;
            System.out.println("The book is successfully borrowed");
        }
    }

    public void returnBook(){
        if(isAvailable){
            System.out.println("This book is not borrowed");
        }else{
            isAvailable = true;
            System.out.println("The book is returned successfully!");
        }
    }
}

class Library{
    List<Book> books;
    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void searchBook(String title){
        boolean found = false;
        for(Book item : books){
            if(item.getTitle().equals(title)){
                System.out.println("The "+item.getTitle()+" by "+item.getAuthor()+" exists");
                found = true;
            }
        }
        if(!found){
            System.out.println("The book with given title does not exist");
        }
    }

    public void borrowBook(String ISBN){
        boolean found = false;
        for(Book item : books){
            if(item.getISBN().equals(ISBN)){
                item.borrowBook();
                found = true;
            }
        }
        if(!found){
            System.out.println("The book with ISBN : "+ISBN+" does not exist in library");
        }
    }

    public void returnBook(String ISBN){
        boolean found = false;
        for(Book item : books){
            if(item.getISBN() == ISBN){
                item.returnBook();
                found = true;
            }
        }
        if(!found){
            System.out.println("The book with ISBN : "+ISBN+" does not exist in library");
        }
    }
}

public class librarymain{
    public static void main(String[] args) {
        Library lib = new Library();

        Book book1 = new Book("1984", "George Orwell", "ISBN001");
        Book book2 = new Book("Life of pi", "Manoj", "ISBN002");

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(new Book("Mahabharatham", "Nannayya", "ISBN007"));

        lib.searchBook("1984");
        lib.borrowBook("ISBN002");
        lib.returnBook("ISBN002");
        lib.returnBook("ISBN007");
    }
}

