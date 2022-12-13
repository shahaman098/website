import java.util.Scanner; 

public class time{

public static void main(String args[]) {

int time=13445;

int hour1=time/(60*60);

int hour=time% (60*60);

int minute=hour*60;

int minute1=hour/60;

System.out.print("13445 sec="+hour1+"hours"+minute1+"minutes"+minute);
}

}
