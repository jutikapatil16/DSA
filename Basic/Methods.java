import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Kunal   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}

// public class PrettyPrinting {
//   public static void main(String[] args) {
//       float a = 453.1274f;
// //        System.out.printf("Formatted number is %.2f", a);

// //        System.out.printf("Pie: %.3f", Math.PI);

//       System.out.printf("Hello my name is %s and I am %s", "Kunal", "Cool");
//   }
// }



// There are many format specifiers we can use. Here are some common ones:

// %c - Character
// %d - Decimal number (base 10)
// %e - Exponential floating-point number
// %f - Floating-point number
// %i - Integer (base 10)
// %o - Octal number (base 8)
// %s - String
// %u - Unsigned decimal (integer) number
// %x - Hexadecimal number (base 16)
// %t - Date/time
// %n - Newline



// public class Operators {
//   public static void main(String[] args) {
//       System.out.println('a' + 'b'); // will print ascii of a + ascii of b
//       System.out.println("a" + "b"); // prints ab
//       System.out.println((char)('a' + 3)); //prints asciiof a +3 i.e d

//       System.out.println("a" + 1); // a1
//       // this is same as after a few steps: "a" + "1"
//       // integer will be converted to Integer that will call toString()

//       System.out.println("Kunal" + new ArrayList<>()); //kunal[]
//       System.out.println("Kunal" + new Integer(56)); //kunal56
//       String ans = new Integer(56) + "" + new ArrayList<>();
//       System.out.println(ans); // prints 56[]

//       System.out.println("a" + 'b');
//   }
// }

// public class Performance {
//   public static void main(String[] args) {
//       String series = "";
//       for (int i = 0; i < 26; i++) {
//           char ch = (char)('a' + i);
//           series = series + ch; // series += ch
//       }

//       System.out.println(series);
//   }
// }