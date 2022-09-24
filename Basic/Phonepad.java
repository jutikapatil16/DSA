public class Phonepad {
  public static void main(String[] args) {
padcount("", "12");
  }

  static void pad(String p, String inputnum) {
    if (inputnum.isEmpty()) {
      System.out.println(p); // base case
      return;
    }

    int charindex = inputnum.charAt(0) - '0'; // '0' important **********// 1, 2, 3, 4, 5--> 0, 1, 2, 3, 4 index
    for (int i = (charindex - 1) * 3; i < charindex * 3; i++) {
    char ch = (char) ('a' + i); // a + 0 = a --> ch , a + 1 = b --> ch 

    pad(p + ch, inputnum.substring(1));
    // add ch in empty string and repeat pricess from 2nd char
  }}

  static int padcount(String p, String inputnum) {
    if (inputnum.isEmpty()) {
      System.out.println(p); // base case
      return 1;
    }
    int count = 0;
    int charindex = inputnum.charAt(0) - '0'; // '0' important **********// 1, 2, 3, 4, 5--> 0, 1, 2, 3, 4 index
    for (int i = (charindex - 1) * 3; i < charindex * 3; i++) {
    char ch = (char) ('a' + i); // a + 0 = a --> ch , a + 1 = b --> ch 

    count = count + padcount(p + ch, inputnum.substring(1)); // add ch in empty string and repeat pricess from 2nd char
  }
  return count;
}
}
