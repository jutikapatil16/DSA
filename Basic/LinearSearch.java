public class LinearSearch {

  public static void main(String[] args) {
    // int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
    // int target = 3;
   
    // int

    // int res = linearSearch(nums, target);
    // System.out.println(res);

    // boolean 

    // boolean ans = linearSearch3(nums, target); 
    // System.out.println(ans);

    // initialise
    String name = "jutika";
    char Target = 'U';
    //call
    boolean an = linearSearch4(name, Target);
    System.out.println(an);
    boolean a=  linearSearch5(name, Target);
    System.out.println(a);

  }
  // 5. Search char in a string(with each char)
  static boolean linearSearch5(String str, char Target) {
    if (str.length() == 0) {
      return false;
    }

    // run a (for every) 
    for (char ch : str.toCharArray()) {
      // check for element at every index if it is = target
      if (ch == Target) {
        return true;
      }
    }

    return false;
  }
  // 4. Search char in a string (with index)
  static boolean linearSearch4(String str, char Target) {
    if (str.length() == 0) {
      return false;
    }

    // run a for loop
    for (int index = 0; index < str.length(); index++) {
      // check for element at every index if it is = target
      if (Target == str.charAt(index)) {
        return true;
      }
    }

    return false;
  }
 

  // 3. search the target and return true or false
  static boolean linearSearch3(int[] arr, int target) {
    if (arr.length == 0) {
      return false;
    }

    // run a for loop
    for (int element : arr) {
      if (element == target) {
        return true;
      }
    }
    // this line will execute if none of the return statements above have executed
    // hence the target not found
    return false;
  }

  // 2. search the target and return the element
  static int linearSearch2(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }

    // run a for loop
    for (int element : arr) {
      if (element == target) {
        return element;
      }
    }
    // this line will execute if none of the return statements above have executed
    // hence the target not found
    return Integer.MAX_VALUE;
  }

  // 1. search in the array: return the index if item found
  // otherwise if item not found return -1
  static int linearSearch(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }

    // run a for loop
    for (int index = 0; index < arr.length; index++) {
      // check for element at every index if it is = target
      int element = arr[index];
      if (element == target) {
        return index;
      }
    }
    // this line will execute if none of the return statements above have executed
    // hence the target not found
    return -1;
  }

}