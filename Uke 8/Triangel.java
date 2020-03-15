static void triangel(int m, int n) {
  String utskrift = ""; // String som vil utvides
  for (int i = 0; i < m; i++) { // Så lenge i er mindre enn m
    utskrift+=("*"); // skal stringen utvides
  }
  System.out.println(utskrift); // skriver ut stringen

  if (m == n) { // dersom m er det samme som n
    System.out.println(utskrift); // skal en skrive ut stringen
    return; // avslutter
  }

  triangel(m+1, n);
  System.out.println(utskrift);
