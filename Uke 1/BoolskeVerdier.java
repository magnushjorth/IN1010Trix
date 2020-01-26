public class BoolskeVerdier {
  public static void main
  (String [] args) {
    boolean usann = 8 > 15;
    boolean sann = true;
  System.out.println(sann);
    if (sann != usann) {
      System.out.println("Første test slo til!");
    } else {
      System.out.print("Noe gikk feil");
    }
    if (sann == usann) {
      System.out.print("Noe gikk feil!");
    } else {
      System.out.print("Andre test slo ikke til!");
    }
  }
}
