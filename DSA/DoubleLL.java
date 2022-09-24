public class DoubleLL {
  //initialize
  Node head;
  int size = 0;
  //class
  public class Node{
    String data;
    Node next;
    Node prev;
  // constructor
  public Node(String data) {
    this.data = data;
  // this.next = next;
  // this.prev = prev;
      size++;
    }
 
  }
  public void addFirst(String data) {
    Node newNode = new Node(data);
    //object then logic
    //newnode ka next pointing to head 

    newNode.next = head;
    newNode.prev = null;
    if (head != null){
      head.prev = newNode;
    };
    
    head = newNode;
}

public void addLast(String data) {
  Node newNode = new Node(data);
  // lastnode is basically temp which will traverse through the linkedlist
  Node lastNode = head;

  // if empty
  if(head == null) {
    newNode.prev = null;
    head = newNode;
    return;
  }

  //if not loop for traversing
  while(lastNode.next != null) {
      lastNode = lastNode.next;
  }

  lastNode.next = newNode;
  newNode.prev = lastNode;
}

//addInMiddle
public void addInMiddle(int index, String data) {

  //invalid
  if(index > size || index < 0) {
      System.out.println("Invalid Index value");
      return;
  }

  size++;
//object
  Node newNode = new Node(data);

 //logic 
  if(head == null || index == 0) {
    //newnode ka next pointing to head 
      newNode.next = head;
      head = newNode;
      return;
  }
  
  Node currNode = head;
//adding in between 
  for(int i=1; i<size; i++) {
      if(i == index) {
          Node nextNode = currNode.next;

          currNode.next = newNode;
          newNode.next = nextNode;
          break;
      }
      currNode = currNode.next;
  }
}

public void display(){
  Node newNode = head;
  Node last = null;
  while(newNode != null){
    //jab tak newNode ka next is not nul keep on printing
    System.out.print(newNode.data + "->");
    last = newNode;
    newNode = newNode.next;
  }
  System.out.println("NULL");

  System.out.println("Print in Reverse");

  while(last!= null){
//coz start is also null therefore jab tak null nahi aata keep on printing in reverse
    System.out.print(newNode.data + "->");
    newNode = newNode.prev;
  }
  System.out.println("NULL START");
} 


public static void main(String args[]) {

  DoubleLL list = new DoubleLL();
//obj.func
  list.addFirst("list");
  list.addFirst("a");
  list.addFirst("is");
  list.addFirst("this");
  list.display();
}

}

