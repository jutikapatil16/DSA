import java.util.*;

public class LL {
  //1. declare head and size
  Node head;
  //2. initialize size
  int size = 0;
  //3.  Node class
  public class Node {
    // declare data and next
      int data;
      Node next;
    // Node constructor
    public Node(int data) {
        //data , next
          this.data = data;
          this.next = null;
        //size increment
          size++;
      }
  }

//4. addFirst

public void addFirst(int data) {
    Node newNode = new Node(data);
    //object then logic
    //newnode ka next pointing to head 

    newNode.next = head;
    head = newNode;
}

//5. addLast

public void addLast(int data) {
  Node newNode = new Node(data);

  if(head == null) {
      head = newNode;
      return;
  }

  Node lastNode = head;
        //loop for traversing
  while(lastNode.next != null) {
      lastNode = lastNode.next;
  }

  lastNode.next = newNode;
}

//6. printList

public void printList() {
  Node currNode = head;
//loop for printing
  while(currNode != null) {
      System.out.print(currNode.data+" -> ");
      currNode = currNode.next;
  }

  System.out.println("null");
}

//7. removeFirst

public void removeFirst() {
  if(head == null) {
      System.out.println("Empty List, nothing to delete");
      return;
  }

  head = this.head.next;
  size--;
}

//8. removeLast
public void removeLast() {
  if(head == null) {
      System.out.println("Empty List, nothing to delete");
      return;
  }
// after removing size decrements by 1
  size--;

  if(head.next == null) {
      head = null;
      return;
  }

  Node currNode = head;
  Node lastNode = head.next;
  while(lastNode.next != null) {
      currNode = currNode.next;
      lastNode = lastNode.next;
  }

  currNode.next = null;
}

//9. getSize
public int getSize() {
  return size;
}

//10. add in the middle
public void addInMiddle(int index, int data) {

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


   public static void main(int args[]) {
      //  LinkedList<int> list = new LinkedList<int>();
      //  list.add("is");
      //  list.add("a");
      //  list.addLast("list");
      //  list.addFirst("this");

      //  System.out.println(list);
      //  list.add(3, "linked");
      //  System.out.println(list.get(0));
      //  System.out.println(list.getSize());   
      //  list.remove(3);
      //  list.removeFirst();
      //  list.removeLast();
      
      //  System.out.println(list);
   }
}


