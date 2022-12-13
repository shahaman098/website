import java.util.Scanner;
public class Interst{
    public static void main (String args[]){
      Scanner sc= new Scanner (System.in);
        System.out.println("Enter total amount:");
        double principle=sc.nextDouble(); 
        System.out.println("Enter time in years: "); 
        double timeinyears=sc. nextDouble();
        System.out.println("Enter rate:");
        double rate = sc.nextDouble();
        double intrest = (principle*timeinyears*rate)/100; 
        System.out.println("your intrest is="+intrest);

    }
}
