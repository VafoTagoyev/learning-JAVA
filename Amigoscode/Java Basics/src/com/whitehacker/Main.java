package com.whitehacker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java 🎉!");
//        System.out.println(10 + 10);


        // ------------------> primitives <------------------

//        int number1 = 20;
//        int number2 = 20;
//        int result = number1 + number2;
//        System.out.println(result);
//        double pi = 3.14;
//        boolean isAdult = false;
//        char a = 'A';
//        short n = 4000;

        // ------------------> numeric literals with underscore <------------------

//        int amount  = 1_000_000_008;
//        double amount1  = 1_008.31;
//        System.out.println(amount1);

        // ------------------> arithmetic operators <------------------

//        int numberOne = 10;
//        int numberTwo = 3;
//        System.out.println(numberOne + numberTwo);
//        System.out.println(numberOne - numberTwo);
//        System.out.println(numberOne * numberTwo);
//        System.out.println(numberOne / numberTwo);
//        System.out.println(numberOne % numberTwo);
//        System.out.println((2 + 2) * (3 / 1) * 2);

        // ------------------> increment and decrement operators <------------------

//        int number = 0;

        // increment operator: ++

//        System.out.println(number++);
//        System.out.println(number);
//        int numberTwo = 0;
//        System.out.println(++numberTwo);
//        System.out.println(numberTwo);

        // decrement operator: --

//        System.out.println(number--);
//        System.out.println(number);
//        int numberTwo = 0;
//        System.out.println(--numberTwo);
//        System.out.println(numberTwo);

        // ------------------> comparison operators <------------------

        // < <= > >= == !=

//        System.out.println(10 > 10);
//        System.out.println(10 >= 10);
//        System.out.println(10 < 10);
//        System.out.println(10 <= 10);
//        System.out.println(10 == 10);
//        System.out.println(10 != 10);
//
//        System.out.println();
//
//        boolean isAdult = 16 >= 16;
//        System.out.println(isAdult);

        // ------------------> naming variables <------------------

//        int numberOfGoals = 0;
//        System.out.println(numberOfGoals);
//
//        // booleans
//        boolean isAdult = true;
//        boolean hasCat = false;

        // ------------------> strings <------------------

//        String amigos = "Amigos";
//        String code = "code";
//        String brand = amigos + code;
//        System.out.println(brand.toUpperCase());
//        System.out.println(brand.toLowerCase());
//        System.out.println(brand.substring(0, 6));
//        System.out.println("    ".isEmpty());
//        System.out.println("    ".isBlank());
//        System.out.println("   a ".isBlank());
//        System.out.println("   a ".trim());

        // ------------------> arrays <------------------

//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 33;
//        numbers[2] = 6;
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers.length);
//
//        int[] numbers2 = {0, 5, 6, 8, 9};
//        System.out.println(Arrays.toString(numbers2));
//        numbers2[1] = 55;
//        System.out.println(Arrays.toString(numbers2));
//        System.out.println(numbers2.length);
//
//        String[] names = {"Jamila", "Alex"};

        // ------------------> arrays null values <------------------

//        int[] numbers = new int[3];
//        Arrays.fill(numbers, -1);
//        numbers[0] = 2;
//        System.out.println(Arrays.toString(numbers));
//
//        String[] names = new String[3];
//        Arrays.fill(names, "foo");
//        names[1] = "Jamila";
//        System.out.println(Arrays.toString(names));

        // ------------------> loops <------------------

//        System.out.println("Start of for loop");
//        for(int i = 1; i <= 10; i++) {
//            System.out.println("Hello " + i);
//        }
//        System.out.println("End of for loop");
//
//        System.out.println("Reverse for loop");
//        for(int i = 10; i >= 1; i--) {
//            System.out.println("Hello " + i);
//        }

        // ------------------> loops and arrays <------------------

//        String[] names = {
//                "James",
//                "Nadia",
//                "Sophia",
//                "Alex",
//                "Saleh",
//                "Aisha"
//        };
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

        // ------------------> if statements <------------------

//        int age = 4;
//        boolean isAdult = age >= 16;
//        boolean isToddler = (age >= 1 && age <= 3);
//
//        if(isAdult) {
//            System.out.println("is adult :)");
//        } else if (isToddler) {
//            System.out.println("toddler :)");
//        } else {
//            System.out.println("good luck :)");
//        }
//
//        System.out.println("Code outside if");

        // ------------------> methods <------------------

        /*
            - Access Modifier
            - Optional static
            - Return type
            - Name
            - Optional Parameters
            - Method Body
            - Optional return value
        */

//        double yield = calculatePropertyYield(1_300, 250_000);
//        System.out.println("Your property yield is: " + yield);
    }

//    private static double calculatePropertyYield(double rent, double propertyPrice) {
//        double yearlyRent = rent * 12;
//        return (yearlyRent / propertyPrice) * 100;
//    }
}