package DayOne;

import java.util.Scanner;

public class ConditionalStatment {
    static void main(String[] args) {
        //scanner : input from the user(external source)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int personAge = scanner.nextInt();
        scanner.close();

        String status = personAge>18?"Good to vote":"Not good to vote";
        System.out.println(status);

        //program to check even or odd
        System.out.println("Enter a number to decide even or odd");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("the number " + number + "is even");
        }else {
            System.out.println("the number is " + number + "is odd");
        }

        }



    }

