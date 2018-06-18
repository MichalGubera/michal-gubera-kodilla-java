package com.kodilla.stream.book;

import java.util.ArrayList;
import java.util.List;

public final class BookDirectoryWithSignature {
    private final List<BookWithSignature> bookList = new ArrayList<>();

    public BookDirectoryWithSignature() {
        bookList.add(new BookWithSignature("Dylan Murphy", "Wolf of the mountain",2003, "0001"));
        bookList.add(new BookWithSignature("Phoebe Pearson", "Slaves of dreams",2012, "0002"));
        bookList.add(new BookWithSignature("Morgan Walsh", "Obliteration of heaven",2001, "0003"));
        bookList.add(new BookWithSignature("Aimee Murphy", "Rejecting the night",2015, "0004"));
        bookList.add(new BookWithSignature("Ryan Talley", "Gangsters and kings",2007, "0005"));
        bookList.add(new BookWithSignature("Madelynn Carson", "Unity without duty",2007, "0006"));
        bookList.add(new BookWithSignature("Giancarlo Guerrero", "Enemies of eternity",2009, "0007"));
    }

    public ArrayList<BookWithSignature> getBookList() {
        return new ArrayList<BookWithSignature>(bookList);
    }
}
