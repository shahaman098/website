import java.util.Scanner;
public class sphere{
    public static void main(String args[]) {
        Scanner sc= new Scanner (System.in); 
        System.out.println("Enter radius: ");
        double radius=sc.nextDouble(); 
        double pi= 3.14;
    double a=Math.pow(radius,3);
        double areaofsphere =(4/3)*pi*a;
        System.out.println("Area of sphere" + areaofsphere);
        
    }
}
