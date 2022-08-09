import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
  public static void main(String[] args) {
    //1. for array 

 Scanner input = new Scanner(System.in);
    // int[] arr = new int[5];
    // arr[i] = in.nextInt();
    

    //2. for arraylist

 ArrayList<Integer> arrlist = new ArrayList<>(5); //****
  //  arrlist.add(45);
  //  arrlist.add(43);
  //  arrlist.add(434);
  //  arrlist.add(432);
  //  arrlist.add(232);
  //  arrlist.add(421);

  // arrlist.remove(5);
  // arrlist.set(0, 78);

  // System.out.println(arrlist);

    //3. Multi Array list (arraylist of arraylist)
    
  ArrayList<ArrayList<Integer>> list = new ArrayList<>(); //*******

  for (int i = 0; i <3; i++) {
    list.add(new ArrayList<>()); //initialising 3 lists in thislist
  }
  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      list.get(i).add(input.nextInt()); //add elements
    }
  }
  System.out.println(list);
  }
}
