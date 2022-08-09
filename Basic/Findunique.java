

public class Findunique {

public static void main(String[] args) {

  int[] arr = { 2,3,4,3,6,4,2};
  System.out.print(ans(arr));
}

public static int ans(int[] arr){
 int unique =0;

   for (int i : arr ){
    unique = unique^i;
   }

 return unique;
}
}

