package org.example;

public class Main {
    public static void main(String[] args) {
        Chain chain = new Chain();

        System.out.println(chain.chain.getClass());

//Calling chain of responsibility
        chain.process(new Number(90));
        chain.process(new Number(-50));
        chain.process(new Number(0));
        chain.process(new Number(91));
    }
}