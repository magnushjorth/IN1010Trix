/*
b && x == 0 // false
b || x == 0 // true
!b && x == 0 // true
!b || x == 0 // true
b && x != 0 // false
b || x != 0 // false
!b && x != 0 // false
!b || x != 0 // true
*/

class Sannhetsverdien {
  boolean b;
  int x;

  public Sannhetsverdien(boolean b, int x) {
    this.b = b;
    this.x = x;
  }

  public boolean utregning() {
    return !b || x != 0;
  }

  public static void main(String[] args) {
    Sannhetsverdien sh = new Sannhetsverdien(false, 0);
    System.out.println(sh.utregning());
  }
}
