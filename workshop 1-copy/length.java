import java.util.Scanner;

public class length{

public static void main (String args[]) { 
    Scanner m= new Scanner (System.in);
    System.out.println("Enter length in meter: ");

double length=m.nextDouble(); 

double inch=length*12;

System.out.println("length in inch is:" + inch);
}
}
