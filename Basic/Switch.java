import java.util.Scanner;

public class Switch{
  public static void main(String[] args) {
    // input
    Scanner input = new Scanner(System.in);
    String fruit = input.next();
    // String color = input.next();
    // int day = input.nextInt();

// 1. if
    // if (fruit == "Mango"){
    // System.out.println("King of fruits ");
    // }
    // if (fruit == "Grapes"){
    // System.out.println("King of fruits ");
    // }


  // 2. switch 
    // switch (fruit) {
    //   case "Mango":
    //     System.out.println("King of fruits");
    //     break;

    //   case "Grapes":
    //     System.out.println("small fruit");
    //     break;

    //   case "Orange":
    //     System.out.println("Round fruit");
    //     break;

    //   case "Pear":
    //   case "Avocado":
    //     System.out.println("Green fruit");
    //     break;
    //   default:
    //     System.out.println("please enter a valid fruit");
    // }
    
    //3. switch with ->

    // switch(day){
    //   case 1,2,3,4,5 -> System.out.println("Weekday");
    //   case 6,7 -> System.out.println("Weekend");
    
    // }

    //4.  nested switch

    // switch (fruit) {
    //   case "Mango":
    //     System.out.println("King of fruits");
    //     break;

    //   case "Grapes":
    //     System.out.println("small fruit");
    //     break;

    //   case "Orange":
    //   switch(color){
    //     case "Pear":
    //     System.out.println("Green is the fruit");
    //       break;
    //     case "Avocado":
    //       System.out.println(" fruit is Green");
    //       break;
    //   }
    //     break;
    //   default:
    //     System.out.println("please enter a valid fruit");
    // }

  }
}