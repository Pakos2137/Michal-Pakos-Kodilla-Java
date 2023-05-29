package com.kodilla.patterns2.adapter;

import com.kodilla.patterns2.adapter.bookclassifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){

        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1","Title1",2005,"1"));
        bookSet.add(new Book("Author2","Title2",1992,"2"));
        bookSet.add(new Book("Author3","Title3",1997,"3"));

        int median = medianAdapter.publicationYearMedian(bookSet);

        assertEquals(1997,median);
    }
}
