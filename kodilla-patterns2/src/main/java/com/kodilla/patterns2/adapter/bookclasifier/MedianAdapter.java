package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> map = new HashMap<>();
        for(Book books : bookSet) {
            BookSignature bookSignature = new BookSignature(books.getSignature());
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book bookLibraryb = new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(books.getAuthor(), books.getTitle(), books.getPublicationYear());
            map.put(bookSignature, bookLibraryb);
        }
        return medianPublicationYear(map);
    }
}
