package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;


public class StreamMain {

    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is ann example text.");
        processor.execute(codeToExecute);


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String bText = poemBeautifier.beautify("jestem wielki", (text -> text.toUpperCase()));
        System.out.println(bText);

        String bText1 = poemBeautifier.beautify("JESTEM WIELKI ", (text -> text.repeat(4)));
        System.out.println(bText1);

        String bText2 = poemBeautifier.beautify("JESTEM WIELKI a moze jednak nie", (text -> text.toLowerCase()));
        System.out.println(bText2);

        String bText3= poemBeautifier.beautify("jestem wielki", (text -> text.replace("jestem","byłem")));
        System.out.println(bText3);




    }
}