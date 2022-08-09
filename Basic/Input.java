import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//     1. array of primitives
        int[] arr = new int[5]; //***
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 233;
        // arr[3] = 543;
        // arr[4] = 3;
        // [23, 45, 233, 543, 3]
        // System.out.println(arr[3]);


        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(); //***
        }

//     2. using for loops
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
//     3. toString() method
       System.out.println(Arrays.toString(arr));

      
//      4. for every 
       for(int num : arr) { // for every element in array, print the element
           System.out.print(num + " "); //  here num represents element of the array
       }

//        System.out.println(arr[5]); // index out of bound error as only till 4

//      *****Array of objects******
        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "kunal";

        System.out.println(Arrays.toString(str));
    }
}



// Multidimensional arrays

// import java.util.Arrays;
// import java.util.Scanner;

// public class MultiDimension {
//     public static void main(String[] args) {
        
//         Scanner in = new Scanner(System.in);
// //      int[][] arr = new int[3][3];

// //      int[][] arr  = {
// //                {1, 2, 3},   // 0th index
// //                {4, 5},      // 1st index
// //                {6, 7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9}
// //        };

//         int[][] arr  = new int[3][3];

//         System.out.println(arr.length); // no of rows will be printed
//         // input
//         // for every row 
//         for (int row = 0; row < arr.length; row++) {
//           // for each col in every row
//             for (int col = 0; col < arr[row].length; col++) {
//                 arr[row][col] = in.nextInt();
//             }
//         }

//         // 1. output(for loop only)
// //        for (int row = 0; row < arr.length; row++) {
// //            // for each col in every row
// //            for (int col = 0; col < arr[row].length; col++) {
// //                System.out.print(arr[row][col] + " ");
// //            }
// //            System.out.println();
// //        }

//         // 2. output() for loop (tostring) 
// //        for (int row = 0; row < arr.length; row++) {
// //            System.out.println(Arrays.toString(arr[row]));
// //        }
//          //3. output for every (tostring)
//         for(int[] a : arr) {
//             System.out.println(Arrays.toString(a));
//         }
//     }
// }
//stringbuilder
// public class SB {
//     public static void main(String[] args) {
//         StringBuilder builder = new StringBuilder();
//         for (int i = 0; i < 26; i++) {
//             char ch = (char)('a' + i); //********
//             builder.append(ch);
//         }

//         System.out.println(builder.toString());

//         builder.reverse();

//         System.out.println(builder);
//     }
// }