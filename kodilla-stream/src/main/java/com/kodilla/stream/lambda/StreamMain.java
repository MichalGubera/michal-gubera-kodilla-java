package com.kodilla.stream.lambda;

public class StreamMain {
    public static void main(String[] args) {
//        System.out.println("Welcome to module 7 - Stream");
        //podejście obiektowe
//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);

        //podejście funkcyjne
//        Processor processor = new Processor();
//        Executor codeToExecute = () -> System.out.println("This is an example text.");
//        processor.execute(codeToExecute);
        //wyrażenie lambda
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));
    }
}
