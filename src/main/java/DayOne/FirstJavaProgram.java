package DayOne;

public class FirstJavaProgram {
    static void main(String[] args) {

        System.out.println("Hello Klara");

        //variable

        String x = "5" ;
        String y = "10" ;
        System.out.println(x + y);

        //numbers
        int a = 5 ;
        int b = 10;
        System.out.println("the sum of a and b is : ");
        System.out.println(a + b);

        //float
        float f = 3.5F;
        System.out.println(f);

        //double
        double d =1.43;
        d = 5;
        System.out.println(d);


        String firstName = "Klara";
        String lastName = "Ehab";

        //concetenate
        String fullName = firstName + " " + lastName;
        int age = 21;
        String dateOfBirth  = "12/7/2004";
        String job = "Tester";
        double income = 12.5;

        System.out.println("Hello my name is " + fullName +
                "\nmy age is :" + age +
                "\nmy income is :" + income + "EGP" +
                "\n my job is : " + job);

        System.out.println("-----------------------------");

        System.out.printf("My age is : %s%n"
                + "My date of Birth is %s%n"
                + "My income is %s%n"
                + "My job is %s%n",
                age , dateOfBirth , income, job );





    }
}
