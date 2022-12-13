import java.util.Scanner;   
public class calculate{
public static void main(String args[]) {
    double a, b, addition, subraction, multiplication, division, modulos, exponent;

    Scanner d=new Scanner(System.in);

System.out.print("Enter first number:");

a=d.nextDouble();

System.out.print("Enter second number");

b=d.nextDouble();

addition=a+b;

subraction=a-b;

multiplication=a*b;

division=a/b;

modulos=a%b;

exponent=Math.pow(a, b);

System.out.println("addition="+addition);

System.out.println("subraction="+subraction); System.out.println("multiplication="+multiplication);

System.out.println("division="+division);

System.out.println("modulos="+modulos);

System.out.println("exponent="+exponent);

}
}