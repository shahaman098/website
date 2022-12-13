import java.util.Scanner;

public class

pasal{

public static void main (String args[]) {

Scanner sc= new Scanner (System.in);

System.out.println("Enter Cost Price:");

double cp = sc. nextDouble();

System.out.println("Enter Selling price: "); double sp= sc.nextDouble();

if (cp>sp) {

double a=((cp-sp)*100)/cp;

System.out.println("Cp percent is="+a); }

else{

double b=((sp-cp)*100)/cp;

System.out.println("Sp percent is="+b);

}

}

}