import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
  //while
  Scanner in = new Scanner(System.in);
  
  System.out.println("Enter a number :");
  int a = in.nextInt();
  while(a != 4){
    System.out.print(a + " "); a--;}

  //for
  for(int count = 1; count !=9 ; count ++){
    System.out.println("Hello World");
  }

  // do while 
  int n = 1;
  do {
    System.out.println(n);
    n++;
  }while(n < 1);
  }
}
