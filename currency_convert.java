import java.util.Scanner;

public class currency_convert {
        //variables accurate as of 09/18/24
        static final double CAD = 1.36; //usd to canadian dollar
        static final double RUB = 93.62; //usd to russian ruble
        static final double EUR = 0.90; //usd to euro
        static final double GBP = 0.76; //usd to british pounds
        static final double CNY = 7.08; //usd to chinese yuan
        static final double JPY = 142.24; //usd to japanese yen
    public static void main(String[] args) {
        //Program to convert currencies
        Scanner scnr = new Scanner(System.in);

        //Variable decleration
        double usd;

        //Ask user for US Dollar ammount
       System.out.println("Enter currency ammount in USD: ");
        usd = scnr.nextDouble();

        //conversion
        double cad_Conv = usd * CAD;
        double rub_Conv = usd * RUB;
        double eur_Conv = usd * EUR;
        double gbp_Conv = usd * GBP;
        double cny_Conv = usd * CNY;
        double jpy_Conv = usd * JPY;


        //output converted currency
        System.out.printf("$%.2f USD is valued at the following: %n", usd);
        System.out.printf("$%.2f CAD%n$%.2f RUB%n$%.2f EUR%n$%.2f GBP%n$%.2f CNY%n$%.2f JPY%n",
                cad_Conv, rub_Conv, eur_Conv, gbp_Conv, cny_Conv, jpy_Conv);

    }
}
