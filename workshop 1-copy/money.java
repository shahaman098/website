import java.util.Scanner;

public class money{

public static void main (String arg[]) {

Scanner sc= new Scanner(System.in);

System.out.println("Enter Any Amount In Paisa:");

double AmountInPaisa = sc.nextInt();

double Rupees=AmountInPaisa/100;

System.out.println("You have Rs "+Rupees);

}

}
