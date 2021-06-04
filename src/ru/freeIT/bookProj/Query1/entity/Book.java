package ru.freeIT.bookProj.Query1.entity;

import java.time.LocalDate;

public class Book {

    private static int counter = 1;
    private int id;
    private String name;
    private Author author;
    private GenreBook genre;
    private LocalDate yearOfPublish;

    public Book(String name, Author author, GenreBook genre, LocalDate yearOfPublish) {
        this.id = counter++;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.yearOfPublish = yearOfPublish;
    }

    @Override
    public String toString() {
        return "Book{ name: " + name + ", author: " + author + ", genre: " + genre + " }";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setGenre(GenreBook genre) {
        this.genre = genre;
    }

    public void setYearOfPublish(LocalDate yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }
}
