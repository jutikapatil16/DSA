import java.util.Arrays;
public class Swap{
  public static void main(String[] args) {
      int a = 10;
      int b = 20;
      swap(a, b);
      System.out.println(a + " " + b);

      String name = "Kunal Kushwaha";
    //**name is pointing to --> kunal kushwaha
      changeName(name);
      System.out.println(name);


      int[] arr = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));
  }

  static void swap(int num1, int num2) {
      int temp = num1;
      num1 = num2;
      num2 = temp;
    // this change will only be valid in this function scope only.
  }
  static void changeName(String naam) {
    naam = "Rahul Rana"; 
    //**Here it's not changing the name(original) to Rahul Rana but creating a new object and naam is now pointing to -->Rahul Rana
    // naam is defined inside changename function so it cab accessed only in this function
}

static void change(int[] nums) {
  nums[0] = 99; // if you make a change to the object via this ref variable, same object will be changed
}
}
