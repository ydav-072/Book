package ru.freeIT.bookProj.Query1.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Library {
    private List<Book> allBookList = new LinkedList<>();

    public Library(List<Book> allBookList) {
        this.allBookList = allBookList;
    }

    public Library() {
    }

    public void addBook(Book book) {
        boolean flag = false;
        for (Book bookFind : allBookList) {
            if (bookFind.getId() == book.getId()) {
                flag = true;
                System.out.println("Book available in library, can't added");
                break;
            }
        }
        if (!flag) {
            allBookList.add(book);
            System.out.println("Successfully added book!");
        }
    }

    public List<Author> getAllAuthor() {
        List<Author> authorList = new ArrayList<>();
        if (allBookList.isEmpty()) {
            System.out.println("No books in library, please add book for start");
            return null;
        }
        for (Book book : allBookList) {
            authorList.add(book.getAuthor());
        }
        return authorList;
    }

    public List<Book> getAllBookByAuthor(Author author) {
        boolean flag = false;
        if (allBookList.isEmpty()) {
            System.out.println("No books in library, please add book for start");
            return null;
        }
        List<Book> bookListByAuthor = new ArrayList<>();
        for (Book bookFind : allBookList) {
            if (bookFind.getAuthor().equals(author)) {
                bookListByAuthor.add(bookFind);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Book with " + author.getFirstName() + " " + author.getSecondName() + " not found");
            return null;
        } else
            return bookListByAuthor;
    }

    public void deleteBookById(int id) {
        boolean flag = false;
        for (Book bookFind : allBookList) {
            if (bookFind.getId() == id) {
                allBookList.remove(bookFind);
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Successfully deleted book!");
        } else {
            System.out.println("Book not found by id: " + id);
        }
    }

    public void editBookById(int id, String name, Author author, GenreBook genre, LocalDate yearOfPublish) {
        for (Book bookFind : allBookList) {
            if (bookFind.getId() == id) {
                bookFind.setName(name);
                bookFind.setAuthor(author);
                bookFind.setGenre(genre);
                bookFind.setYearOfPublish(yearOfPublish);
            }
        }
        System.out.println("Successfully edited book!");
    }

    public List<Book> getAllBookList() {
        if (allBookList.isEmpty()) {
            System.out.println("No books in library, please add book for start");
            return null;
        } else
            return allBookList;
    }
}
