package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        Book book1 = new Book("Author1", "Title1", 1914, "s-00001");
        Book book2 = new Book("Author2", "Title2", 1918, "s-00002");
        Book book3 = new Book("Author3", "Title3", 1939, "s-00003");
        Book book4 = new Book("Author4", "Title4", 1944, "s-00004");
        Book book5 = new Book("Author5", "Title5", 1945, "s-00005");

        Set<Book> testBookSet = new HashSet<>();
        testBookSet.add(book1);
        testBookSet.add(book2);
        testBookSet.add(book3);
        testBookSet.add(book4);
        testBookSet.add(book5);

        MedianAdapter testMedianAdapter = new MedianAdapter();

        //When
        int testMedian = testMedianAdapter.publicationYearMedian(testBookSet);

        //Then
        assertEquals(1939, testMedian);
    }
}
