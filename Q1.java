import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float ht, wt;

        System.out.print("Enter your height in cm: ");
        ht = in.nextFloat();
        System.out.print("Enter your weight in kg: ");
        wt = in.nextFloat();
        
        float bmi = (10000*wt) / (ht * ht);

        System.out.println("Your BMI INDEX IS: ");
        System.out.println(bmi);

        in.close();
    }
}
