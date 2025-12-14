package DayOne;

public class Operators {
    static void main(String[] args) {
        // Relational Operators
        int a = 10, b = 2;
        System.out.println(a > b); // false
        System.out.println(a < b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true
        System.out.println(a = b); // true

        // Logical Operators
        boolean val1 = true;
        boolean val2 = false;
        System.out.println(val1 && val2); // false
        System.out.println(val1 || val2); // true

        System.out.println(!val1); // false → negation
        System.out.println(!val2); // true→ negation


        // if(abdi > almi || tamioz) {
        // System.out.println("ادخل ادب ");
        // } else {
        // System.out.printtn("ادخل علمي");
        //  }

        // Increment and Decrement Operators
        int num = 10;
        System.out.println(num++); // post-increment → 10
        System.out.println(num); // 11 → post-increment
        // system.out.println(num);
        System.out.println(++num); //pre-increment

        //int a = 100, D = 200, c:
        //c = (a=b)? a:D: '' ternary operator
        //System.out println(*The Largest value is: " + g);
        //if (a =b)
        //{
        //c = a;
        //} else {
        // C = b}
        //System.out.println("The Largest value is: " + c):

        //System.out.println(a + b); // 30
        //System. out.printn(*The sum of int a and int b is: " + a + b); // concatenation → The sum of int a and int b is: 1020
        //System. out.println( The sum of int a and int b is: " + (a + b)): / The sum of int a and int b is: 36

        System.out.printf("The sum of a and b is: %d%n", a + b);
        System.out.printf("The multi of a and b is: %d%n", a * b);
        System.out.printf("The div of a and b is: %d%n", b / a);
        System.out.printf("The sub of a and b is:%d%n", b - a);


    }
}
