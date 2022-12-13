import java.util.Scanner;

public class parm{

public static void main(String arg[]) {

Scanner R=new Scanner(System.in);

System.out.print("Enter Breadth:");

int b = R.nextInt();

System.out.print("Enter Height ");

int h= R.nextInt();

double area=b*h;

System.out.println("area of parm is:"+area);

}

}
