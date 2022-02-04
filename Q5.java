import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Enter a number to be checked: ");
        n = in.nextInt();

        switch(n % 2){
            case 0:
                System.out.println("It is even.");
                break;
            case 1:
                System.out.println("It is odd.");
                break;
            default:
                System.out.println("Wrong Input");
        }

        in.close();

    }
}

//  ALTERNATIVE USING SWITCH CASE.

/*
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Enter a number to be checked: ");
        n = in.nextInt();

        if(n % 2 == 0){

            System.out.println("It is even number.");
        }
        else{

            System.out.println("It is odd");
        }

        in.close();

    }
}

*/
