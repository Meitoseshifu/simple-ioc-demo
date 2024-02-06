package com.bobocode.demo;

public class DemoApp {
    public static void main(String[] args) {
        var context = new CustomContext();
        var printer = context.getBean(HelloPrinter.class);
        printer.printHello();

        var morningGreetingPrinter = context.getBean(MorningGreetingPrinter.class);
        System.out.println(morningGreetingPrinter.morning("Taras"));
    }
}
