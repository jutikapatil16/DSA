
//PARENT CLASS

public class Box {
  //initialise
  double l;
  double h;
  double w;
  
  // Box(){
  //   this.h = -1;
  //   this.l = -1;
  //   this.w = -1;
  // }

  // Box(double side){
  //   this.w = side;
  //   this.l = side;
  //   this.h = side;
  //  }


  //constructor
   Box(double l , double h , double w){
    this.w = w;
    this.l = l;
    this.h = h;
   }

   public void information(){
    System.out.println("Running box");
   }
}

