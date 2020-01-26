import java.util.Scanner;
import java.io.File;

class Gruppeoppmoete {
  private String[] navn = new String[14];
  private boolean[] oppmoete = new boolean[14];
  private int totaltStudenter = 0;

  public void lesInnFil(String filnavn) throws Exception {
    Scanner innfil = new Scanner(new File(filnavn));
    while(innfil.hasNextLine() && totaltStudenter < navn.length) {
      navn[totaltStudenter] = innfil.nextLine();
      totaltStudenter++;
    }
  }

  public void registrerOppmoete(String studentnavn) {
    for (int i=0; i<totaltStudenter; i++) {
      if (studentnavn.equals(navn[i])) {
        oppmoete[i] = true;;
      }
    }
  }

  public void skrivUtAlleOppmoette() {
    for (int i = 0; i < navn.length; i++) {
      System.out.println(navn[i] + " : " + oppmoete[i]);
    }
  }
}
