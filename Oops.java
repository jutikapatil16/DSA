public class Oops
{
  public static void main(String[] args) {
  
//1. print for 1st way without parameters
  //declare and new object being created
    // Student jutika = new Student();

    // System.out.println(jutika.marks);

  // System.out.println(this k jagah p joh chaiye .joh retrieve karna hai woh);


  
  //3. print for 2nd way with parameters

  //declare and new object being created
  Student jutika = new Student(67,"JUTZ",89f);


  //method 1 :
  // System.out.println(jutika.rno);
  // System.out.println(jutika.name);
  // System.out.println(jutika.marks);
    
  //method 2 : 
  jutika.display();

    //2. print
  jutika.greeting();

  }
  
} 


//class
class Student{

  //declare
  int rno;
  String name;
  float marks;
  static String college ="SIES";
  
  //functions 
  void greeting() {
    // System.out.println("Hello My name is " + name);
    //even if name and not this.name it will print the same, sill always use this.name
    System.out.println("Hello My name is " + this.name);
  }
  void display(){
    System.out.println(rno+" "+ name + " " + marks + " " + college);
  }

//constructor - whenever new object is created it goes to constructor

//1. constructor (this is not correct way as for different reference variables roll, name , marks wil be same which we dont want )

Student(){
this.rno =67;
this.name = "JUTIKA P";
this.marks= 100;

}

//2. constructor 
Student(int roll , String naam, float marks){
  this.rno = roll;
  this.name = naam;
  this.marks= marks;
  }
}