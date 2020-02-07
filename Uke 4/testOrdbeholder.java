class testOrdbeholder {
  public static void main(String[] args) {
    Ordbeholder ordbeholder = new Ordbeholder();
    if (ordbeholder.pop() == null) {
      System.out.println("1.1 - True");
    } else {
      System.out.println("1.1 - False");
    }

    if (ordbeholder.settInn("Kaffe")) {
      System.out.println("1.2 - True");
    } else {
      System.out.println("1.2 - False");
    }

    if (! ordbeholder.settInn("Kaffe")) {
      System.out.println("1.3 - True");
    } else {
      System.out.println("1.3 - False");
    }

    ordbeholder.settInn("Te");
    ordbeholder.settInn("Brus");

    if (ordbeholder.antallOrd() == 3) {
      System.out.println("1.4 - True");
    } else {
      System.out.println("1.4 - False");
    }

    if (ordbeholder.pop().equals("Brus")) {
      System.out.println("1.5 - True");
    } else {
      System.out.println("1.5 - False");
    }

    if (ordbeholder.antallOrd() == 2) {
      System.out.println("1.6 - True");
    } else {
      System.out.println("1.6 - False");
    }
  }
}
