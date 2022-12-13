import java.util.Scanner;

public class stationary{
    public static void main (String arg[]) { Scanner sc= new Scanner (System.in);
        System.out.println("Enter rate of pen");
        double rateofpen= sc.nextDouble(); System.out.println("amount of pen you need:");
        int pen=sc.nextInt();
        System.out.println("Enter rate of copy");
        int rateofcopy=sc.nextInt(); 
        System.out.println("amount of copies you need: ");
        int copy=sc.nextInt();
        System.out.println("Enter rate of pencil: ");
        double rateofpencil=sc.nextDouble();
        System.out.println("amount of prncil you need: ");
        int pencil=sc.nextInt();
        double Total=(rateofpen*pen)+(rateofcopy*copy)+(rateofpencil*pencil);
        System.out.println("amount you need to pay is: "+ Total);
        
    
    }
}
