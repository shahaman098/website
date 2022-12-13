import java.util.Scanner;
public class marks{
    public static void main (String args[]) {
        double a, b, c, d, average;
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter your marks in subject a:");
    a=sc.nextDouble();
        System.out.println("Enter your marks in subject b:");
        b=sc.nextDouble();
        System.out.println("Enter your marks in subject c:");
        c=sc.nextDouble();
        System.out.println("Enter your marks in subject d:");
        d=sc.nextDouble();
        
        if(a<40 || b<40 || c<40 ||d<40){
            System.out.println("you failed");
        } else {
            System.out.println("you passed");
        }
    }
}
