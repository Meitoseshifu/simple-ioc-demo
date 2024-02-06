package com.bobocode.demo;

@Bean("morningBean")
public class MorningGreetingPrinter {

    String morning(String name) {
        return "Good morning, " + name;
    }
}
