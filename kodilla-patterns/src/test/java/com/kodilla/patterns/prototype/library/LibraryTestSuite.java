package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        IntStream.iterate(1,n->n+1)
                .limit(5)
                .forEach(n->library.getBooks().add(new Book("Title " + n, "Author" + n, LocalDate.of(2000+n,01,01))));

        //When
        Library shallowLibrary = null;
        try {
            shallowLibrary = library.shallowCopy();
            shallowLibrary.setName("Library Shallow");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepLibrary = null;
        try {
            deepLibrary = library.deepCopy();
            deepLibrary.setName("Deep Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().add(new Book("Super", "Master", LocalDate.of(2001,12,12)));

        //Then
        System.out.println(library);
        System.out.println(shallowLibrary);
        System.out.println(deepLibrary);
        assertEquals(6,library.getBooks().size());
        assertEquals(library.getBooks(),shallowLibrary.getBooks());
        assertNotEquals(library.getBooks(), deepLibrary.getBooks());

    }
}
