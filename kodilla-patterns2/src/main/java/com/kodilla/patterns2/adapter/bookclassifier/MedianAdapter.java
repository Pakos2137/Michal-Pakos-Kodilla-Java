package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books = new HashMap<>();
        bookSet.stream()
                .forEach(n->books.put(new BookSignature(n.getSignature()),new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(n.getAuthor(),n.getTitle(),n.getPublicationYear())));

        return medianPublicationYear(books);
    }
}