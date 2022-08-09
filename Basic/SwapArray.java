
import java.util.Scanner;

public class SwapArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] arr = new int[5];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = input.nextInt();
    }
    int start = 0;
    int end = arr.length -1;
    reverse(arr, start, end);
    // swap( arr, 1,3);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] +" ");
    } 
  
  }

  static void reverse(int[] arr, int start,int end ){
    while(start<end){
      swap(arr, start, end);
      start++;
      end--;
    }
    

  }
  static void swap(int[] arr, int index1 ,int index2 ){
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
