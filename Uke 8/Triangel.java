public class Triangel {
  static void printTriangler(int m, int n) {
    String utskrift = "";
    for (int i = 0; i < m; i++) utskrift+="*";

    System.out.println(utskrift);

    if (m == n) {
      System.out.println(utskrift);
      return;
    }

    printTriangler(m+1, n);
    System.out.println(utskrift);
  }

  public static void main(String[] args) {
    printTriangler(3, 5);
  }
}
