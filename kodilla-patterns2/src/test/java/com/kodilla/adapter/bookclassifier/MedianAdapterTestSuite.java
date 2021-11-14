package com.kodilla.adapter.bookclassifier;

import com.kodilla.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author1", "Title1", 1990, "abcdefgh1"));
        books.add(new Book("Author2", "Title2", 2000, "abcdefgh2"));
        books.add(new Book("Author3", "Title3", 1991, "abcdefgh3"));
        books.add(new Book("Author4", "Title4", 1987, "abcdefgh4"));
        books.add(new Book("Author5", "Title5", 2012, "abcdefgh5"));
        MedianAdapter adapter = new MedianAdapter();
        //When
        int median = adapter.publicationYearMedian(books);
        //Then
        assertEquals(1991,median);
    }
}
