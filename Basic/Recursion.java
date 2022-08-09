import java.lang.Math;
public class Recursion {
  public static void main(String[] args) {
      // write a function that takes in a number and prints it
      // print first 5 numbers: 1 2 3 4 5

      //   print1(1);

      // fibonacii
      //   int ans = fibo(50);
      //   System.out.println(ans);

      //Binary search

    //   int[] arr = {1, 2, 3, 4, 55, 66, 78};
    //   int target = 78;
    //System.out.println(search(arr, target, 0, arr.length - 1));

    //printing
        //   func3(5);
        //   func4(5);

    //factorial
        // int res=  factorial(5);
        // System.out.println(res);

    // sum of digits

    // int answer =  sumofdigits(1342);
    // int answer =  Prodofdigits( 1342);
    // System.out.println(answer);

    //reverse

    System.out.println(rev2(1432));

    //palindrome
    System.out.println(palin(13531));
    
    //count
    System.out.println(countZeroes(30204, 0));

  }

//   static void print1(int n) {
//       System.out.println(n);
//       print2(2);
//   }

//   static void print2(int n) {
//       System.out.println(n);
//       print3(3);
//   }

//   static void print3(int n) {
//       System.out.println(n);
//       print4(4);
//   }
//   static void print4(int n) {
//       System.out.println(n);
//       print5(5);
//   }
//   static void print5(int n) {
//       System.out.println(n);
//   }

// //1. fibonacci number  
//   static int fibo(int n) {
//     // base condition
//     if (n < 2) {
//         return n;
//     }
//     return fibo(n-1) + fibo(n-2);
// }

// // 2. Binary Search using recursion
// static int search(int[] arr, int target, int s, int e) {
//   if (s > e) {
//       return -1;
//   }
//   int m = s + (e - s) / 2;
//   if (arr[m] == target) {
//       return m;
//   }
//   if (target < arr[m]) {
//       return search(arr, target, s, m - 1);
//   }
//   return search(arr, target, m + 1, e);
// }
//3. printing
// static void func3(int n){

//     if (n == 0){
//        return;
//     }
//     System.out.println(n);
//     func3(n-1);
// }
// static void func4(int n){

//     if (n == 0){
//        return;
//     }
//     func4(n-1);
//     System.out.println(n);

// }
// 4. Factorial using Recursion 
// static int factorial(int n){

//     if (n==1){
//         return 1;
//     }else{
//         return n*factorial(n-1);
//        
//     }

// }

//5. sum of digits
static int sumofdigits(int n){

// normal
    // int rem= n % 10; //1342--> 2 , 134--> 4
    // int res = 0;
    // res = res + rem; // 0+ 2 + 4 
    // n = n / 10;//134, 13
// using recursion
  if (n == 0){
    return 0;
  }else{
    return (n % 10) + sumofdigits(n/10); 
  }


}
//6.. Product of digits
static int Prodofdigits(int n){

// using recursion
  if (n%10 == n){
    return n;
  }else{
    return (n % 10) * Prodofdigits(n/10); 
  }
}
//7. REverse a number
static int sum = 0;
static int rev(int num){
    //1795
    // int rev =0;
    // int rem = num % 10; //5 9 7
      
    // rev = rev * 10 + rem; //5 59 597
    // num = num / 10; //179 17 1
    // return rev;
    if (num == 0){
        return 0;
    }else {
      int rem = num % 10; //5 9 7
      sum= (sum * 10) + rem; //5 59 597
      rev(num/10);
      return sum;
    }
}
static int rev2(int num){  
  int digits = (int)(Math.log10(num))+1;
    {
      return helper(num,digits);
    }
}

private static int helper(int num,int digits){
  int rem = num % 10;
  //base conditions are very important in recursion otherwise it will go in loop
  if(rem  == num){
    return num;
  }
  else{
    return (rem*(int)Math.pow(10,digits-1) + helper(num/10,digits-1));
  }
  }

  static boolean palin(int n){
    //15351
     if (n == rev(n)){
      return true;
     }
     else{
      return false;
     }
  }
  static int countZeroes(int n , int count){
    //30204
    int rem = n % 10; 
    if (n==0){
      return count;
    }
    else if (rem == 0){
      return countZeroes(n/10 , count + 1);
    }
    else{
      return countZeroes(n/10 , count);
    }
  }

}


