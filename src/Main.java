public class Main
{
    public static void main(String[] args) {
        double initialBalance = 5000.00;
        final double TAX_RATE = .17;
        double taxAmount = 0.00;

        taxAmount = initialBalance * TAX_RATE;
        System.out.println("Your Tax on " + initialBalance + "is " + taxAmount);
    }


}