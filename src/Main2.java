import java.util.Scanner;

public class Main2 {
    
    public static void main(String[] args) {
        float a, b, c, d, e;

    System.out.println("introduce dos numeros :");
     Scanner input1 = new Scanner(System.in);
     float no1 = input1.nextInt();
    Scanner input2 = new Scanner(System.in);
    float no2 = input2.nextInt();
    a = no1 + no2;
    b = no1 - no2;
    c = no1 * no2;
    d = no1 / no2;
    e = no1 % no2;

    System.out.println("Suma =  " + a);
    System.out.println("resta =  " + b);
    System.out.println("multp. =  " + c);
    System.out.println("div. =  " + d);
    System.out.println("resto =  " + e);
}
}