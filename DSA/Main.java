
public class Main {
  public static void main(String[] args) {
    Boxweight box4 = new Boxweight(2, 3, 4, 8);
    
    System.out.println(box4.l + " "  + box4.h + " " + box4.w + " " + box4.weight);

    Box box5 = new Boxweight(2, 5, 9, 7);
    // Here box5.weight is not accessible because the TYPE OF OBJECT(i.e boxweight has all four) doesn't determine but TYPE OF REFERENCE VARIABLE ( haws only l , h , w) determines what will be be acessible

    //you can have parent reference variable(Box) and child object (Boxweigt) but not the the otherwise th
    System.out.println(box5.l + " "  + box5.h + " " + box5.w + " " );

    // System.out.println(box5.weight);
    BoxPrice box6 = new BoxPrice(2, 3, 4, 8, 6);
    System.out.println(box6.l + " "  + box6.h + " " + box6.w + " " + box6.weight+" " + box6.cost );

  }
}
