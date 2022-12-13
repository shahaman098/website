import java.util.Scanner;
public class distance{
    public static void main(String args[]) {
        double U,T,A,D;
        Scanner d=new Scanner(System.in);
        System.out.print("Enter Initial Velocity:");
        U=d.nextDouble();
        System.out.print("Enter time:");
        T=d.nextDouble();
        System.out.print("Enter acceleration:");
        A=d.nextDouble();
        D=(U*T)+(1/2)*(A*T*T);
        System.out.print("Distance Covered is: "+D);
}
}