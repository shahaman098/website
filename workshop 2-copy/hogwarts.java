import java.util.Scanner;

public class hogwarts{

public static void main (String[] args) {

Scanner sc = new Scanner(System.in);

String harry = "A";

String ron = "B";

String hermoine = "C";

System.out.print ("Enter a letter A B C: ");

String l =sc.next();

if (l.equals(harry) ) { 
    System.out.println("harry");

}

if(l.equals (ron)) { 
    System.out.println("ron");

}

if(l.equals(hermoine)) {

System.out.println("hermoine"); }

}

}
