import java.util.Scanner;
public class TaxComputation {
    public static void main(String[]args){
        Scanner grossInput=new Scanner(System.in);

        double grosspay,taxamount=0,netpay;

        System.out.println("Enter Your GrossPay:>>");
        grosspay=grossInput.nextDouble();

        if(grosspay>40000)
            taxamount=(grosspay * 0.30);
        else if(grosspay>=30000 && grosspay<40000)
            taxamount=(grosspay * 0.25);
        else if(grosspay>=20000 && grosspay<30000)
            taxamount=(grosspay * 0.15);
        else if(grosspay>=10000 && grosspay<20000)
            taxamount=(grosspay * 0.10);
        else
            taxamount=(grosspay * 0.0);

        netpay=(grosspay-taxamount);

        System.out.println("\nThe Tax Amount Paid is:>>" +taxamount);
        System.out.println("\nThe Net pay is:>>" +netpay);

    }
}
