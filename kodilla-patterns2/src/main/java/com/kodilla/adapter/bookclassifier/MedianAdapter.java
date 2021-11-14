package com.kodilla.adapter.bookclassifier;

import com.kodilla.adapter.bookclassifier.librarya.Book;
import com.kodilla.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.adapter.bookclassifier.libraryb.Book> booksB = new HashMap<>();

        for (Book bookA:bookSet) {
            BookSignature signature = new BookSignature(bookA.getSignature());
            com.kodilla.adapter.bookclassifier.libraryb.Book bookB =
                    new com.kodilla.adapter.bookclassifier.libraryb.Book
                            (bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear());
            booksB.put(signature,bookB);
        }
        return medianPublicationYear(booksB);
    }
}
