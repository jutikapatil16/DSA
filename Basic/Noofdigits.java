public class Noofdigits {
  public static void main(String[] args) {
      int n = 10;
      int b = 2;
      // 6 —> 110— > 3 digits 

      // for this there’s a formula
      int ans = (int)(Math.log(n) / Math.log(b)) + 1;

      System.out.println(ans);
  }
}
