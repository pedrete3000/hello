import java.util.ArrayList; //importem la classe
import java.util.Collections;
public class Arreglos {
public static void main(String[] args) {
ArrayList<String> alumnes = new ArrayList<String>();
alumnes.add("Pep");
alumnes.add("Paco");
alumnes.add("Aina");
alumnes.add("Lluïsa");
alumnes.add("Joan");
System.out.println(alumnes);
System.out.println(alumnes.get(2));
Collections.sort(alumnes);
System.out.println(alumnes);
Collections.reverse(alumnes);
System.out.println(alumnes);
} // final main
} // final Arreglos