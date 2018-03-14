package com.kodilla.spring.library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class Library {
    private final List<String> books = new ArrayList<>();
//    private final LibraryDbController libraryDbController;
//    private LibraryDbController libraryDbController;

//    @Autowired
//    public Library(final LibraryDbController libraryDbController) {
//        this.libraryDbController = libraryDbController;
//    }

//    @Autowired
//    public void setLibraryDbController(LibraryDbController libraryDbController) {
//        this.libraryDbController = libraryDbController;
//    }

//    @Autowired
//    private LibraryDbController libraryDbController;
//
////    public Library() {
////        // do nothing
////    }
//
//    public void saveToDb() {
//        libraryDbController.saveData();
//    }
//
//    public void loadFromDb() {
//        libraryDbController.loadData();
//    }

    private LibraryDbController libraryDbController;

    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}