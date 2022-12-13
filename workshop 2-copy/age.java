import java.util.Scanner; 
public class age{

public static void main(String args[]) {

Scanner d=new Scanner(System.in);

System.out.print("Enter age");

int n=d.nextInt();

if (n <= 16) {

System.out.print("child");

}else if (n >= 17 || n <= 50 ) {

System.out.print("adult");

}else{

System.out.print("old");

}

}
}
