
public class SortedArray {


//check arr[i] <arr[i+1] & remaining array should also be sorted 
//base condition and no iteration 

public static void main(String[] args) {
 int[] arr = {4,5,6,7,2};
 
 System.out.println(sorted(arr,0));
}
static boolean sorted(int[] arr, int index){
  if (index == arr.length -1){
    return true;
  }else{
    return arr[index]<arr[index+1] && sorted(arr,index+1);
  }
  
  
}
}
