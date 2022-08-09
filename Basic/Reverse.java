import java.util.Scanner;
public class Reverse {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int num = in.nextInt();
    int rev = 0;
    int rem;
    while (num>0){
      
      rem = num % 10; //7 9 5
      
      rev = rev * 10 + rem; //7 79 795
      num = num / 10; //2359 235
    }
    System.out.println(rev);
  }
}
