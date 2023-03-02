package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        Library library = new Library("Library");
        Book book1 = new Book("Blizej Nieznana ksiazka", "Anonim", LocalDate.of(1343,1,1));
        Book book2 = new Book("Czysty kod", "Robert C. Martin", LocalDate.of(2010,1,1));
        Book book3 = new Book("Manifest Komnustyczny", " Karl Marx, Friedrich Engels",LocalDate.of(1848,1,1));
        Book book4 = new Book("Ania z Zielonego Wzgórza", "Lucy Maud Montgomery", LocalDate.of(1908,1,1));
        Book book5 = new Book("Potop", "Henryk Sienkiewicz", LocalDate.of(1886,1,1));

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);
        library.books.add(book5);

        for(Book list : library.books) {
            System.out.println(list);
        }

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library3");
        } catch (CloneNotSupportedException e ) {
            System.out.println(e);
        }

        //shallowCopyCheck
        assertEquals(library.books,clonedLibrary.books);

        //deepCopyCheck
        assertNotEquals(library.books,deepClonedLibrary.books);
    }
}
