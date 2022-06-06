
public class Main {
    public static void main(String[] args) {
        //test
        double bal = 5000;
        double tax = .17;
        double firstMonth = (bal*tax)+bal;
        System.out.println("Your balance one month in is " + firstMonth);
        double secondMonth = (firstMonth*tax)+firstMonth;
        System.out.println("Your balance two months in is " + secondMonth);

    }
}