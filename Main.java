import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double price1;
        double price2;
        double price3;
        double price4;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a fall price: ");
        price1 = s.nextDouble();
        System.out.println("Please enter a spring price: ");
        price2 = s.nextDouble();
        System.out.println("Please enter a summer price: ");
        price3 = s.nextDouble();
        System.out.println("Please enter a winter price: ");
        price4 = s.nextDouble();
        System.out.println("Your fall price is: " + price1);
        System.out.println("Your spring price is: " + price2);
        System.out.println("Your summer price is: " + price3);
        System.out.println("Your winter price is: " + price4);
        System.out.println("Your total yearly price is: " + (price1+price2+price3+price4));

    }
}