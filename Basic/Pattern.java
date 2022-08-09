public class Pattern {

  public static void main(String[] args) {
    pattern1(6);
    System.out.println();
    pattern2(6);
    System.out.println();
    pattern3(6);
    System.out.println();
    pattern4(6);
    System.out.println();
    pattern5(6);
    System.out.println();
    pattern6(6);
    System.out.println();
    pattern7(6);
    System.out.println();
    pattern8(6);
    pattern9(6);
  }

  static void pattern1(int n) {

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

  }

  static void pattern2(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern3(int n) {

    for (int i = n; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern4(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
  // *
  // * *
  // * * * 
  // * * * *
  // * * * * * 
  // * * * * * * 
  // * * * * *
  // * * * * 
  // * * * 
  // * *
  // *
  
  static void pattern5(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = n - 1; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

//6. easy
//      *
//     * *
//    * * *
//   * * * * 
//  * * * * * 
// * * * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
  static void pattern6(int n) {
    for (int row = 0; row < 2 * n; row++) {

      int cols = row > n ? 2 * n - row : row;
      int spaces = n - cols;

      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      for (int i = 1; i <= cols; i++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  //7. easy

  //         1 
  //       2 1 2
  //     3 2 1 2 3 *
  //   4 3 2 1 2 3 4
  // 5 4 3 2 1 2 3 4 5

  static void pattern7(int n) {
    //for row = 3 
    for (int row = 1; row < n; row++) {
      
      // 2 spaces = n - row = 5 - 3
      for (int space = 0; space < n - row; space++) {
        System.out.print("  ");
      }
      //from 3 to 1
      for (int col = row; col >= 1; col--) {
        System.out.print(col+" ");
      }
      //then again 2 to 3
      for (int col = 2; col <= row; col++) {
        System.out.print(col+" ");
      }
      System.out.println();
    }
  }

  // medium
  static void pattern8(int n) {
  
    for (int row = 1; row <= 2* n; row++) {
      int c = row > n ? 2 * n - row : row;
      
     
      for (int space = 0; space < n - c; space++) {
        System.out.print("  ");
      }
   
      for (int col = c; col >= 1; col--) {
        System.out.print(col+" ");
      }

      for (int col = 2; col <= c; col++) {
        System.out.print(col+" ");
      }
      System.out.println();
    }
  }
  //medium
  static void pattern9(int n) {
    int originalN = n;
    n = 2 * n;
    for (int row = 0; row <= n; row++) {
        for (int col = 0; col <= n; col++) {
            int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
            System.out.print(atEveryIndex + " ");
        }
        System.out.println();
    }
}
}