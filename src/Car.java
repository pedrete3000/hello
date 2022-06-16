import java.util.Scanner;

public class Car {
    public void fulltrote() {
      
        System.out.println(" El maximo de velocidad es....");
    }
    public void velo(String maxspeed) {
        System.out.println("max.=" + maxspeed);
    }
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe la velocity");
    String i = sc.nextLine();  
    Car myCar = new Car();
    myCar.fulltrote();
  myCar.velo(i);
}
}
