public class BachelorStudent extends Student {
  BachelorStudent(String navn, int alder, String kurs, String laerested) {
        super(navn, alder, kurs, laerested);
  }
  public boolean harTilgang() {
    return false;
  }
  public void skrivInfo() {
    System.out.println("Bachelorstudent: " + navn + " - Alder: " + alder + "\nKurs: " + kurs + " - Lærested: " + laerested);
  }
}
