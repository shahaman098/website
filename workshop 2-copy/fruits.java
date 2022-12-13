import java.util.Scanner;

public class fruits{

public static void main (String[] args) {

Scanner sc = new Scanner(System.in);

String Apple = "A"; 
String Banana = "B";

String Coconut = "C";

System.out.print ("Enter a letter: ");

String l=sc.next();

if (l.equals(Apple) ) { 
    System.out.println("Apple");

}

else if(l.equals (Banana)) {
    System.out.println("Banana");

} else if(l.equals (Coconut)){

System.out.println("Coconut");

}

else {

System.out.println("Enter letter A B C only");
}
}
}
