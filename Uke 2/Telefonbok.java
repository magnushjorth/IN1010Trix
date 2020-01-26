import java.util.HashMap;
import java.util.Scanner;
import easyIO.*;

class Telefonbok {
  public static void main(String[] args) {
    HashMap<String, String> telefonliste = new HashMap<String, String>();

    telefonliste.put("Arne", "22334455");
    telefonliste.put("Lisa", "95959595");
    telefonliste.put("Jonas", "97979797");
    telefonliste.put("Peder", "12345678");

    In tast = new In();
    Out skjerm = new Out();

    int input = 0;

    while (input != 1) {
      System.out.println("Meny:\n0: Søk etter person\n1: Avslutt");
      input = Integer.parseInt(in.nextLine());

      if (input == 0) {
        System.out.println("Hvem vil du ha nummeret til? ");
        String navn = tast.inLine();

        if (telefonliste.containsKey(navn)) {
          String tlf = telefonliste.get(navn);
          System.out.println("Navn: " + navn + ", tlf: " + tlf);
        } else {
          System.out.println("Fant ikke " + navn + ".");
        }
      }
    }
    System.out.println("Oversikt: ");
    for (String navnekey : telefonliste.keySet()) {
      System.out.println("Navn: " + navnekey + ", tlf: " + telefonliste.get(navnekey));
    }
  }
}
