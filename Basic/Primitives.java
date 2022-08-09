import java.util.Scanner;
public class Primitives {
  public static void main(String[] args) { 
    int rollno =64;
    char letter = 'r';
    float marks = 98.67f;
    double largeDecNum= 45546546.6765;
    long largeInteger = 3457754375437L;
    boolean check = false;
//integer
    Scanner input = new Scanner(System.in); 
    System.out.print("please enter some input number :");
    int no = input.nextInt();
    System.out.println("Your no. is " + no);
//string
    System.out.print("please enter some string :");
    String name = input.next();
    System.out.println(name);
//float
    System.out.println(marks);

// typecasting
  int a = (int)(marks);
  System.out.println(a);
  int number = 'A';
 System.out.println(number);
  }
 
  
}
