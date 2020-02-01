import java.util.HashMap;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class StudentSystem {
  private HashMap<String, Fag> fagliste = new HashMap<String, Fag>();
  private HashMap<String, Student> studentliste = new HashMap<String, Student>();
  private Scanner tastatur = new Scanner(System.in);

  public void lesFraFil(String filnavn) throws Exception{
      Scanner fil = new Scanner(new File(filnavn));
      String linje;
      Fag fag = null;
      while(fil.hasNextLine()){
        linje = fil.nextLine();
        //Sjekker om linje er fagkode ved forekomst av *
        if(linje.charAt(0) == '*'){
          //Oppretter nytt fag. Fjerner * ved bruk av substring.
          fag = new Fag(linje.substring(1));
          fagliste.put(fag.toString(), fag);
        } else {
          Student student;
          //Sjekker om student finnes.
          if(studentliste.containsKey(linje)){
            student = studentliste.get(linje);
          } else {
            student = new Student(linje);
            studentliste.put(student.toString(), student);
          }
          student.leggTilFag(fag);
          fag.leggTilStudent(student);
      }
    }
  }

  public void meny(){
  System.out.println("*************STUDENTSYSTEM***********");
  System.out.println("1: Legg til ny student.");
  System.out.println("2: Legg til nytt fag.");
  System.out.println("3: Skriv ut alle studenter som tar et spesifikt fag.");
  System.out.println("4: Skriv ut alle fag en spesifikk student tar");
  System.out.println("5: Meld opp en student til et emne.");
  System.out.println("6: Meld av en student til et emne.");
  System.out.println("7: Fjern en student fra systemet.");
  System.out.println("8: Fjern et fag fra systemet.");
  System.out.println("9: Finne ut hvilket fag som blir tatt av flest studenter.");
  System.out.println("10: Finne ut hvilken student som tar flest fag.");
  System.out.println("11: Skriv ut alle fag og hvilke studenter som tar de.");
  System.out.println("0: Avslutt.");
  }

  public void ordrelokke() {
    int inputFraBruker = -1;
  }
}
