import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    boolean ans = prime(x);
    System.out.println(ans);
  }

  static boolean prime(int x) {
    if ( x <= 1) {
      return false;
    } 
    int i = 2;
    while(i*i<= x) {
        if (x % i == 0) {
          return false;
        } 
        i++;
    }
    if(i*i>x){
      return true;
    }
    
    return false;
    }
  
  }

  

