package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class MedianAdapteeTestSuite {


    @Test
    void publicationYearMedianTestOdd(){
        //Given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();

        bookSet.add(new Book("Autor1","Title1",1992,"TEST123"));
        bookSet.add(new Book("Autor2","Title2",1997,"TEST213"));
        bookSet.add(new Book("Autor3","Title3",2012,"TEST423"));
        bookSet.add(new Book("Autor4","Title4",2019,"TEST543"));
        bookSet.add(new Book("Autor5","Title5",2000,"TEST643"));
        //When
        int result = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2000,result);
    }

    @Test
    void publicationYearMedianTestEven(){
        //Given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();

        bookSet.add(new Book("Autor1","Title1",1992,"TEST123"));
        bookSet.add(new Book("Autor2","Title2",1997,"TEST213"));
        bookSet.add(new Book("Autor3","Title3",2012,"TEST423"));
        bookSet.add(new Book("Autor4","Title4",2019,"TEST543"));
        bookSet.add(new Book("Autor5","Title5",2000,"TEST643"));
        bookSet.add(new Book("Autor7","Title6",2002,"TEST876"));
        //When
        int result = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2001,result);
    }
}