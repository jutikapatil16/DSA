import java.util.Scanner;

public class Function {
public static void main(String[] args) {

// main function runs first 
//1. 
       String message = greet();
       System.out.println(message);
//2.    //first takes the input
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        
        // then return what is in the mygreet in personalised and then print personalised
        String personalised = myGreet(naam);
        System.out.println(personalised);
//3. sum
      int ans = sum();
      System.out.println(ans);
        
      int sum3 = sum3(20, 30);
      System.out.println(sum3);
    }


// 1. function greet with no parameters and return 
static String greet() {
        String greeting = "how are you";
        return greeting;
    }
// 2.  function mygreet with parameters and return 
static String myGreet(String name) {
      String message = "Hello " + name;
      return message;
  }

// 3. return the value w/o parameters
static int sum() {
  
  Scanner in = new Scanner(System.in);
  System.out.print("Enter number 1: ");
  int num1 = in.nextInt();
  System.out.print("Enter number 2: ");
  int num2 = in.nextInt();

  int sum = num1 + num2;
  return sum;

//System.out.println("This statement will never execute as its after the return statement");
}
//4. pass the value of numbers when you are calling the method in main() and return the value 
static int sum3(int a, int b) {
  int sum = a + b;
  return sum;
}

}

