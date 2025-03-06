import java.util.Scanner;

public class Main {
    public static void main(String[] args){

       //printf() = is a method use to format output;
        //&[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n" , name);
        System.out.printf("Your name starts with a %c\n" , firstLetter);
        System.out.printf("You are %d years old" , age);
        System.out.printf("You are %f inches tall\n" , height);
        System.out.printf("Employed: %b\n" , isEmployed);

        System.out.printf("%s is %d years old\n" , name , age);

        //precision
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;
        System.out.printf("%.3f\n" , price1);
        System.out.printf("%.3f\n" , price2);
        System.out.printf("%.3f\n" , price3);

        //flags
        // + = output a plus
        // , = comma grouping separator
        // ( =negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive
        double price4 = 9000.99;
        double price5 = 100.15;
        double price6 = -54.01;
        System.out.printf("%,.2f\n" , price4);
        System.out.printf("%(.2f\n" , price5);
        System.out.printf("%(.2f\n" , price6);

        System.out.printf("% .2f\n" , price4);
        System.out.printf("% .2f\n" , price5);
        System.out.printf("% .2f\n" , price6);

    }
}
