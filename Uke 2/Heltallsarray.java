class Heltallsarray {
  public static void main (String[] args) {
    int[] heltall = {0, 1, 2, 3, 4};
    for (int i = 0; i < heltall.length; i++) {
      System.out.println(i);
    }

    int[] fem = new int[5];

    for (int i = 0; i < heltall.length; i++) {
      fem[i] = heltall[i];
    }
  }
}
