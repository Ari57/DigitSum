package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Sum of digits in 125 is " + sumDigits(125));
//        System.out.println("Sum of digits in 562 is " + sumDigits(562));
//        System.out.println("Sum of digits in 621 is " + sumDigits(621));
//        System.out.println("Sum of digits in 732 is " + sumDigits(732));

        int num = 32123;
        int rem = 0;
        int sum = 0;
        //num = 256, 25, 2
        while(num > 0) {
            rem = num % 10;
            // 256 = 6
            // 25 = 5
            // 2 = 2
            sum = sum + rem;
            // 256 = 0 + 6
            // 25 =  6 + 5
            // 2 = 11 + 2
            num = num / 10;
            // 256 = 25
            // 25 = 2
            // 2 / 10 = 0
            // loop will break
            // to find the sum of digits, the loop will go round and round until number = 0
        }
        System.out.println("The sum of the digits is " + sum);
    }
}
