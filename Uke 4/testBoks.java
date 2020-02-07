class testBoks {
  public static void main(String[] args) {
    Boks b1 = new Boks(10, 10, 10);
    Boks b2 = new Boks(10, 10, 0);

    System.out.println("\nTester boks1\n");

    if (b1.beregnAreal() == 600) {
      System.out.println("1.1 - True");
    } else {
      System.out.println("1.1 - False");
    }

    if (b1.beregnVolum() == 1000) {
      System.out.println("1.2 - True");
    } else {
      System.out.println("1.2 - False");
    }

    System.out.println("\nTester boks2\n");

    if (b2.beregnAreal() == 200) {
      System.out.println("2.1 - True");
    } else {
      System.out.println("2.1 - False");
    }

    if (b2.beregnVolum() == 0) {
      System.out.println("2.2 - True");
    } else {
      System.out.println("2.2 - False");
    }
  }
}
