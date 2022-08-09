import java.util.Scanner;
public class CountOcc {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int num = in.nextInt();
    int match = in.nextInt();
    int count = 0;
   
    while(num>0){
      
      int n = num % 10;
        if(n== match) {
          count = count +1 ;
        }
      num = num /10; 
    }
    System.out.println("The occurences of " + match + " = " + count);
  }
}
