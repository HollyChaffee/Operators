package com.hollychaffee;


import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;  //3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10;  // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;  // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;  //the remainder of (4 % 3) = 1
        System.out.println("4 / 3 = " + result);

        // result = result + 1;
        result++;  // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--;  // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10;  // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3;
        result /= 3;  // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2;
        result -= 2;  // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is false");
        }
                // x += y is x = x + y
                // x -= y is x = x - y
                // x *= y is x = x * y
                // x /= y is x = x / y
                // x %= y is x = x % y
                // x ^= y is x = x ^ y
                // x &= y is x = x & y
                // x |= y is x = x | y

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("WasCar is true");
        }

        // Sample code:
        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        // Operand one - ageOfClient == 20 is the condition we are checking. It needs to return true or false.
        // Operand two - true here is the value to assign to the variable isEighteenOrOver if the condition above is true.
        // Operand three - false is the value to assign if the condition is false.

        //Challenge
        double num = 20.00d;
        double num2 = 80.00d;
       // System.out.println((num + num2) * 100);
        double numTotal = (num + num2) * 100.00d; // Operator precedence parentheses then multiplication
        System.out.println("numTotal = " + numTotal);
        double theRemainder = numTotal % 40.00d;  // theRemainder set to the value of numTotal modulus (remainder) 40.00
        // 10,000/40 = 250, no remainder
        System.out.println("theRemainder = " + theRemainder);
        boolean checkRemainder = (theRemainder == 0) ? true :false;
        System.out.println("checkRemainder = " + checkRemainder);

        if (!checkRemainder) {
            System.out.println("Got some remainder");

        }



//        double num = (20.00d + 80.00d) * 100.00d;
//        System.out.println(num);
//        num = num % 40.00d;
//        System.out.println(num);
//
//        double num = 0;
//        boolean numResult = ();



    }
}




