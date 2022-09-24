import java.util.Scanner;

public class permutationRecursion {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.next();
    printPermutations("",str);

  }
  public static void printPermutations(String ansasofnow ,String ques){

    if(ques.length() == 0){
      System.out.println(ansasofnow);
      return;
    }

    for (int i = 0; i < ques.length(); i++) {
      char ch = ques.charAt(i);
      String qlpart = ques.substring(0,1);
      String qrpart = ques. substring(i+1);
      String restOfquestion = qlpart+qrpart;

      printPermutations(restOfquestion,ansasofnow+ch);


    }
  }
}
