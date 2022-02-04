import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        
        float r;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter radius of circle: ");
        r = in.nextFloat();

        double ans = (Math.PI) *(r *r);

        System.out.println("Area of circle is: " + ans);

        in.close();
        
    }
    
}
