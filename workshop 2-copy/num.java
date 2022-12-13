import java.util.Scanner;
public class num{

public static void main(String args[]){

Scanner n=new Scanner(System.in);

System.out.print("Enter a number:");

int number=n.nextInt();

if (number<8){

System.out.println("Your number is negative");

}else{

System.out.println("Yournumber is positive");
}
}
}
