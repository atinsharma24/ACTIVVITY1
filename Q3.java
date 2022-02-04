import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        String name, reg_no;
        float cgpa;

        System.out.println("Enter name refno and cgpa: ");

        name = in.nextLine();
        reg_no = in.nextLine();
        cgpa = in.nextFloat();

        System.out.println("Details given by student are: ");
        System.out.println("Name is:" + name + "\nreg no is: " + reg_no + "\ncgpa is: " + cgpa);
        

        in.close();
    }
    
}

//DONE
