import java.util.Scanner;
public class Fibonacci {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();

    int a= 0;
    int b =1;
    System.out.println(0);
    System.out.println(1);
    while((num-1)>0){
    int res = a + b ;
    num--;
    a = b;
    b = res;

    System.out.println(res);
    }
    System.out.println(b);
    
  }
}
