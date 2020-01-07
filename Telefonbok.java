import java.util.HashMap;
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
    boolean fortsett = true;
    do {
      skjerm.out("Navn: ");
      String person = tast.inLine();

      System.out.println(telefonliste.get(person));

      skjerm.out("Ønsker du å fortsette: ");
      String svar = tast.inLine();

      if (svar == "ja") {
        fortsett = true;
      } else {
        fortsett = false;
      }
    }
    while (fortsett = true);
  }
}
