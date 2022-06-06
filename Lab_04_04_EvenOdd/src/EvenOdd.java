import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number = s.nextInt();
        if (number%2==0)
            System.out.println("Your number is even.");
        if (number%2==1)
            System.out.println("Your number is odd.");

    }
}