import java.util.Scanner;

public class pe{

public static void main (String args[]){

double pe, m, h;

double g=9.8;

Scanner sc= new Scanner(System.in);

System.out.println("Enter mass of an object in kg:");

m = sc.nextInt();

System.out.println("Enter height in meter: ");

h = sc.nextInt();

pe=m*g*h;

System.out.println("Enter Potential Energy of the object is="+pe);
}
}
