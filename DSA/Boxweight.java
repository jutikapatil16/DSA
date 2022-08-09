//CHILD CLASS

public class Boxweight extends Box{
  //initialise
  double weight;
  // constructor
  public Boxweight(double l , double h , double w , double weight){
    super(l,h,w); // what is this ? calling the parent class constructor
    this.weight = weight;
  }


  // public Boxweigth(){
  // this.weight =-1;
  // }
}
