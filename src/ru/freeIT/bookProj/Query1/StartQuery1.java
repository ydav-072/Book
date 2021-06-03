package ru.freeIT.bookProj.Query1;

import ru.freeIT.bookProj.Query1.entity.Author;
import ru.freeIT.bookProj.Query1.entity.Book;
import ru.freeIT.bookProj.Query1.entity.GenreBook;
import ru.freeIT.bookProj.Query1.entity.Library;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;

public class StartQuery1 {

    public static void main(String[] args) {
        Library library = new Library();
        Author author1 = new Author("Vasilii", "Uillis");
        Author author2 = new Author("Parovozov", "Arbuz");
        Author author3 = new Author("Cris", "Yellow");
        LocalDate localDate = LocalDate.now();
        Book book1 = new Book("Started Java", author1, GenreBook.PSYCHOLOGY, localDate);
        Book book2 = new Book("A Started Java2", author2, GenreBook.SCIENCE, localDate);
        Book book3 = new Book("Started Java3", author3, GenreBook.FANTASY, localDate);
        Book book4 = new Book("Started Java4", author1, GenreBook.NOVELL, localDate);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book1);

        Collections.sort(library.getAllBookList(), new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        System.out.println(library.getAllBookList());

        library.deleteBookById(8);

        Collections.sort(library.getAllBookList(), new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getId() - o2.getId();
            }
        });
        Collections.reverse(library.getAllBookList());
        System.out.println(library.getAllBookList());


        library.editBookById(2, "Second", author2, GenreBook.DETECTIVE, localDate);

        System.out.println(library.getAllBookList());

        System.out.println(library.getAllAuthor());

        System.out.println(library.getAllBookByAuthor(author1));
    }
}
