package com.operators;

public class LogicalOperators {

    public static void main(String[] args) {

        int age = 22;
        int marks = 75;

        System.out.println("AND: " + (age >= 18 && marks >= 50));

        System.out.println("OR: " + (age >= 18 || marks >= 90));

        System.out.println("NOT: " + !(age >= 18));
    }
}