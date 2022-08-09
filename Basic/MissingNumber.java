public class MissingNumber {
  public static void main(String[] args) {
    int[] arr = { 4, 1, 0, 2 };
    System.out.println(missingnumber(arr));

  }

  public static int missingnumber(int[] arr){
   int i =0;
   while(i<arr.length){

//cyclic sort
    if (arr[i]<arr.length && arr[i]==arr[arr[i]]){
      swap(arr,i,arr[i]);
   }else{
    i++;
   }
//loop for finding first missing number 

   
  }
  for (int j = 0; j < arr.length; j++) {
    if(arr[j]!= j){
      //case1
      return j;
    }

  }
       //case 2 
       return arr.length;
  
  
}
static void swap(int[] arr, int index1, int index2) {
  int temp = arr[index1];
  arr[index1] = arr[index2];
  arr[index2] = temp;
}
}

