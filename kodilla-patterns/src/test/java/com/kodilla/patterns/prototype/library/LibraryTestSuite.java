package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTestSuite {

    @Test
    void testgetBooks() {
        //Given
        Library library = new Library("my Library");
        Book book1 = new Book("Secrets of Alamo", "John Smith", LocalDate.of(2008, Month.OCTOBER, 15));
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", LocalDate.of(2012, Month.DECEMBER, 12));
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", LocalDate.of(2016, Month.FEBRUARY, 20));
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", LocalDate.of(2010, Month.AUGUST, 10));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("my Library - shallow copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("my Library - deep copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.removeBook(book4);

        //Then
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());
    }
    }
