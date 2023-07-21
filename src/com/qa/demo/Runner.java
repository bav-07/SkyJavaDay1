package com.qa.demo;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        byte b = 122;
        short s = 12;
        int i = 2_000_000_000;

        // literals are just values
        // Java sees any number as an int literal, so this does not work as an int literal
        // therefore we put an L at the end of the number so it knows this is a long
        long l = 999_999_999_999_999L;

        // with decimals, double is the default literal
        // so when assigning floats you need to provide the F to tell Java it's a float
        float f = 44.94F;
        double d = 999.999;

        char c = 'J';
        boolean bool = true;
        String str = "Jordan";
        String str2 = "Jordan";

        // when you add Strings together it concatenates them
        System.out.println(str + " Harrison"); // result is Jordan Harrison

        // when you try to add chars together, it thinks you are trying to operate with numbers
        System.out.println(c + 'f'); // result of this is 176

        int num1 = 12;
        int num2 = 12;

        // when you compare two primitive variables with the same
        System.out.println(12 == 12);
        System.out.println(num1 == 12);
        System.out.println(num1 == num2);

        // when you do this with string literals it's the same thing
        System.out.println("2 + 2 = " + (2 + 2));
        System.out.println(str == str2); // true
        // Java does not need to use a new block of memory for each String -> it will just reference an existing equal value String in the String pool
        // therefore str and str2 are pointing to the same place in memory and are therefore equal

        // but if you make a new String like this, this does not go to the pool, it goes to a different memory container entirely
        System.out.println(new String("Jordan") == "Jordan"); // false

        // Generally, avoid using double equals with objects
        // Use .equals() instead
        System.out.println(new String("Jordan").equals("Jordan")); // true

        // Not using .equals() leads to shenanigans like this
        System.out.println("JORDAN" == "jordan".toUpperCase()); // false

    }

}
