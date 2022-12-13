import java.util.Scanner;
public class grade{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter marks in English:");

int English=sc.nextInt();

System.out.println("Enter marks in maths :");
 int maths=sc.nextInt();

System.out.println("Enter marks in nepali:");

int nepali=sc.nextInt();

System.out.println("Enter marks in Science: ");

int Science=sc.nextInt();

System.out.println("Enter marks in social:");

int social=sc.nextInt();

double percent=(English+maths+nepali+Science+social)/5;

if(percent>98){

System.out.println("A+"); 
}else if(percent>=80) {

System.out.println("A"); 
}else if(percent>=70){

System.out.println("B+");

}else if(percent>=60){

System.out.println("B");

}else if(percent>=50){

System.out.println("C+");

}else{

System.out.println("D");
}
}
}
