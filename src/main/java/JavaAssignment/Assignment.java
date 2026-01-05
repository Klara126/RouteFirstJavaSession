package JavaAssignment;
import java.util.Scanner;

public class Assignment {
    static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first integer");
        int num1 = input.nextInt();

        System.out.println("Enter your secound integer");
        int num2 = input.nextInt();

        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Product = " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Remainder (num1 % num2) = " + (num1 % num2));
        } else {
            System.out.println("Cannot calculate remainder (division by zero)");
        }

        System.out.println("\n--- If Conditions ---");
        if (num1 > num2) {
            System.out.println("num1 is greater");
        } else if (num2 > num1) {
            System.out.println("num2 is greater");
        } else {
            System.out.println("Both numbers are equal");
        }

        if (num1 == num2) {
            System.out.println("The two numbers are equal");
        } else {
            System.out.println("The two numbers are not equal");
        }

        System.out.println("\n--- Logical Operators ---");
        if (num1 > 0 && num2 > 0) {
            System.out.println("Both are positive");
        } else if (num1 > 0 || num2 > 0) {
            System.out.println("One is positive");
        } else {
            System.out.println("No positives");
        }
        System.out.println("\n--- Ternary Operator ---");

        String greater =
                (num1 > num2) ? "num1 is greater" :
                        (num2 > num1) ? "num2 is greater" :
                                "Both numbers are equal";
        System.out.println(greater);

        String evenOdd = (num1 % 2 == 0) ? "num1 is even" : "num1 is odd";
        System.out.println(evenOdd);

        input.close();

    }
}
