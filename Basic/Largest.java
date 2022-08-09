import java.util.Scanner;

public class Largest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // method 1 
    System.out.println("enter three  numbers :");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();
    
    if (num1 > num2){
      System.out.println( "Largest number " + num1);
    }
    else if (num2 > num3){
      System.out.println("Largest number "+ num2);
    }else {
      System.out.println("largest Number "+ num3);
    }

    // method 2 
    System.out.println("enter three  numbers :");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();

    int max = a;
    if (b>max){
      max = b;
    }
    if(c>max){
      max = c;
    }
      System.out.println("largest Number " + max);
    
  }
}
