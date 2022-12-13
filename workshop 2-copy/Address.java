public class Address {

public static void main(String agrs[]) {

String a = "John Doe@123 DudleyStreet@123 DudleyStreet";

String[] Str = a.split("@");

for (String b : Str)

System.out.println(b);

}

}
