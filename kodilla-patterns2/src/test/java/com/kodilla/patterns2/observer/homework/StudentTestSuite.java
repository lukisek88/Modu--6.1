package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTestSuite {

    @Test
    public void testUpdateHomeworks(){
        //Given
        Student student1 = new Student("J.K", KodillaCourses.Java_Developer);
        Student student2 = new Student("M.M", KodillaCourses.Java_Developer);
        Student student3 = new Student("A.M", KodillaCourses.Web_Developer);

        Mentor  mentor1 = new Mentor("P.P");
        Mentor  mentor2 = new Mentor("G.G");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor2);
        student3.registerObserver(mentor2);

        //When
        student1.addHomework("6.4", "Junit Tests");
        student2.addHomework("6.5","Mockito");
        student3.addHomework("1.2","Web");
        student1.addHomework("8.2", "try.catch");

        //Then
        assertEquals(2,mentor2.getUpdateCount());
        assertEquals(2,mentor1.getUpdateCount());
    }
}