import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        float rate, duration;
        int principal;

        System.out.println("Enter values of rate pa duration in yrs and principal amt: ");

        rate = in.nextFloat();
        duration = in.nextFloat();
        principal = in.nextInt();
        

        float amt = principal + duration*(rate * principal) / 100;

        System.out.println("Your amout after your given details will be: ");
        System.out.println(amt);
        

        in.close();
    }
    
}
