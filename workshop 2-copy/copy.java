import java.util.Scanner; 
public class copy{
    public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter amount of copies: ");

int copies=sc.nextInt();

if (copies<=99){

double price=copies*0.30;

System.out.println("Price is "+price);

}else if(copies<=499){

double price=copies*0.28;

System.out.println("Price is "+price);

}else if(copies>=799) {

double price=copies*0.27;

System.out.println("Price is "+price); 
}else if(copies<=1000) {

double price=copies*0.26;

System.out.println("Price is "+price);

}else if (copies>1000) {

double price=copies*0.25;
System.out.println("Price is "+price);
}
}

}



