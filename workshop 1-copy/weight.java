import java.util.Scanner;
public class weight{

public static void main(String args[]) {

Scanner k= new Scanner(System.in);

System.out.println("Enter weight in kg: ");

double kg=k.nextDouble();

double gram=kg*1000;

System.out.println("Weight in garams is:" +gram);

}
}