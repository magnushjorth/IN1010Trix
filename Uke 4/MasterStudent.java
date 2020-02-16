public class MasterStudent extends Student {

  MasterStudent(String navn, int alder, String kurs, String laerested) {
  super(navn, alder, kurs, laerested);
  }

  public boolean harTilgang() {
    return true;
  }

  public void skrivInfo() {
    System.out.println("Masterstudent: " + navn + " - Alder: " + alder + "\nKurs: " + kurs + " - Lærested: " + laerested);
  }
}
