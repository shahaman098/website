
import java.util.Scanner;

public class circle{

public static void main (String args[]){

Scanner sc= new Scanner (System.in);

System.out.println("Enter radius: "); double radius = sc.nextDouble();

double pi= 3.14;

double a=Math.pow(radius, 2);

double areaofcircle=pi*a;

System.out.println("Area of circle" + areaofcircle);

}

}