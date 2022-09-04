//Video number 32
public class Skipchar{
  public static void main(String[] args) {
    String string = "bappffgfappleleccad";
    String empty = "";
   func4(empty,string);
  }
//skip if has a with void 
  static void func(String empty,String string){
    if(string.isEmpty()){
      System.out.println(empty);
        return; 
     }

    char ch = string.charAt(0);
    
    if (ch == 'a'){
      func(empty, string.substring(1));
    }else{
      func(empty+ch,string.substring(1));
    }
  }
//skip if has a with return type  
  static String func2(String empty,String string){
    if(string.isEmpty()){
      System.out.println(empty);
      return "";
     }

    char ch = string.charAt(0);
    
    if (ch == 'a'){
      return func2(empty, string.substring(1));
    }else{
      return func2(empty+ch,string.substring(1));
    }
  }

//skip if starts with apple 
  static String func3(String empty,String string){
    if(string.isEmpty()){
      System.out.println(empty);
      return "";
     }

    char ch = string.charAt(0);
    
    if (string.startsWith("apple")){
      return func3(empty, string.substring(5));
    }else{
      return func3(empty+ch,string.substring(1));
    }
  }


  //skip if starts with app not apple
  static String func4(String empty,String string){
    if(string.isEmpty()){
      System.out.println(empty);
      return "";
     }

    char ch = string.charAt(0);
    
    if (string.startsWith("app") && !string.startsWith("apple")){
      return func4(empty, string.substring(3));
    }else{
      return func4(empty+ch,string.substring(1));
    }
  }
}