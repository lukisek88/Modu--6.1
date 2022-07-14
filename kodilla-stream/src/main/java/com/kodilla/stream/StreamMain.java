package com.kodilla.stream;


/*
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.Executor;
*/

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {

    public static void main(String[] args) {
System.out.println("*******************************************************");
System.out.println(" ");

        /*  Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is ann example text.");
        processor.execute(codeToExecute); */

System.out.println("Modul 7.1 Decorate With Lambda");
System.out.println(" ");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String bText = poemBeautifier.beautify("jestem wielki", (text -> text.toUpperCase()));
        System.out.println(bText);

        String bText1 = poemBeautifier.beautify("JESTEM WIELKI ", (text -> text.repeat(4)));
        System.out.println(bText1);

        String bText2 = poemBeautifier.beautify("JESTEM WIELKI ", (text -> text.toLowerCase()+"a moze jednak nie"));
        System.out.println(bText2);

        String bText3= poemBeautifier.beautify("jestem wielki", (text -> text.replace("jestem","byłem")));
        System.out.println(bText3);

        String bText4= poemBeautifier.beautify("jestem wielki", (text -> text+" mam: "+text.length()+" znaków" ));
        System.out.println(bText4);

        System.out.println(" ");
        System.out.println("*******************************************************");
        System.out.println(" ");

        System.out.println("Modul 7.3 stream(),filter(),collect() with map");
        System.out.println(" ");

        Forum forum = new Forum();
        Map<Integer, ForumUser> mapForumUser = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDate(), LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getNumPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getNumID,forumUser-> forumUser));

        mapForumUser.entrySet().stream()
                .map(entry->"ID: "+entry.getKey()+": "+entry.getValue())
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("*******************************************************");






/*
      BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);



       BookDirectory theBookDirectory = new BookDirectory();
        Map<String,Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication()>2005)
                .collect(Collectors.toMap(Book::getSignature,book -> book));

        System.out.println("Elem: "+theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry->entry.getKey()+" : "+entry.getValue())
                .forEach(System.out::println);




     BookDirectory theBookDirectory = new BookDirectory();
        List<Book>theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication()>2005)
                .collect(Collectors.toList());
        System.out.println("Elem: "+theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);



System.out.println("Stream");
        NumbersGenerator.generateEven(20);

        People.getlist().stream()
                .map(String::toUpperCase)
                .filter(s->s.length()>11)
                .map(s -> s.substring(0,s.indexOf(' ')+2)+".")
                .filter(s -> s.substring(0,1).equals("M"))

                .forEach(System.out::println);

   */


    }
}