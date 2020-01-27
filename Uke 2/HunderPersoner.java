import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class HundePersoner {
  public static void main(String[] args) {
    Scanner scanner = null;
    String linje;
    int tall = -1;
    Scanner fil = null;

    ArrayList<Person> personer = new ArrayList<Person>();
    ArrayList<Hund> hunder = new ArrayList<Hund>();

    try{
        scanner = new Scanner(new File("navn.txt"));
    } catch(FileNotFoundException error){
        System.out.println("Fant ikke filen.");
        System.exit(1);
    }


    while(scanner.hasNextLine()){
      try{
        String art = scanner.next();

        if (art.equals("P")) {
          String navn = scanner.next();
          Person person = new Person(navn);
          personer.add(person);
        } else {
          String navn = scanner.next();
          Hund hund = new Hund(navn);
          hunder.add(hund);
        }
      } catch(Exception e){
            continue;
      }
    }

    scanner.close();

    for (int i = 0; i < personer.size(); i++) {
      Person person = personer.get(i);
      System.out.println(person.hentNavn());
    }

    for (int i = 0; i < hunder.size(); i++) {
      Hund hund = hunder.get(i);
      System.out.println(hund.hentNavn());
    }
  }
}
