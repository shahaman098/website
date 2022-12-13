import java.util.Scanner;

public class status{

public static void main(String args[]) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter credit points");
 int a=sc.nextInt();

if(a >= 90) {

System.out.println("Senior Status");

}else if(a >= 60) {

System.out.println("Junior Status");

}else if (a >= 30) {

System.out.println("Freshman status");

}

}

}
