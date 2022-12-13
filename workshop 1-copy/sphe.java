import java.util.Scanner;
public class sphe{

public static void main (String arg[]) {

Scanner sc= new Scanner (System.in); System.out.println("Enter Length:");

int length=sc.nextInt(); 

System.out.println("Enter breadth: ");

int breadth = sc.nextInt();

int areaofRectangle=length*breadth; 

System.out.println("AOR" + areaofRectangle);

}
}