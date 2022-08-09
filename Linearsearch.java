import java.util.ArrayList;

public class Linearsearch {

  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 18, 9, 18 };
    int target = 18;
    int index = 0;
    int start = 0;
    int end = arr.length - 1;
    // System.out.println(LinearSearchreturn(arr,target,index));
    // System.out.println(LinearSearch(arr,target,index));

    // findAllindex(arr, target, index);
    // System.out.println(list);

    System.out.println(findAllindex2(arr, target, index));
    System.out.println(Rbs(arr, start, end, target));

  }
  // static boolean LinearSearch(int[] arr,int target,int index){
  // if(index == arr.length){
  // return false;
  // }else{
  // if(arr[index]==target ){
  // return true;
  // }
  // return LinearSearch(arr,target,index+1);}
  // }

  static int LinearSearchreturn(int[] arr, int target, int index) {
    if (index == arr.length) {
      return -1;
    } else {
      if (arr[index] == target) {
        return index;
      }
      return LinearSearchreturn(arr, target, index + 1);
    }

  }
  // 3rd way
  // static ArrayList<Integer> list = new ArrayList<>();

  // static void findAllindex(int[] arr,int target,int index){
  // if(index == arr.length){
  // return;
  // }else{
  // if(arr[index]==target ){
  // list.add(index);
  // }
  // findAllindex(arr,target,index+1);
  // }

  // }

  // 4th way
  static ArrayList<Integer> findAllindex2(int[] arr, int target, int index) {
    // *** */
    ArrayList<Integer> list = new ArrayList<>();
    // *** */
    if (index == arr.length) {
      return list;
    } else {
      if (arr[index] == target) {
        list.add(index);
      }
      ArrayList<Integer> ansfromBelowCalls = findAllindex2(arr, target, index + 1);
      // ****/
      list.addAll(ansfromBelowCalls);
      return list;
      // ****/
    }

  }

  // rotated binary search
  public static int Rbs(int[] arr, int s, int e, int key) {
    int m = s + (e - s) / 2;

    if (s > e) {
      return -1;
    }
    if (arr[m] == key) {
      return m;
    }

    if (arr[s] <= arr[m]) {
      if (key >= arr[s] && key <= arr[m]) {
        return Rbs(arr, s, m - 1, key);
      } else {
        return Rbs(arr, m + 1, e, key);
      }
    }

    if (key >= arr[m] && key <= arr[e]) {
      return Rbs(arr, m + 1, e, key);
    } else {
      return Rbs(arr, s, m - 1, key);

    }
  }

}
