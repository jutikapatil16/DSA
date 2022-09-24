public class StackDS {

  //Node class
  private static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
//stack class
static class Stack {
  //intially head is null
    public static Node head = null;

    public static boolean isEmpty() {
      return head == null;
  }

    public static void push(int data) {
        Node newNode = new Node(data);
//if head is null then make it a new node
        if(isEmpty()) {
            head = newNode;
            return;
        }
// if not null then head ho jaayega newNode ka next 
        newNode.next = head;
// and newNode ban jaayega head 

        head = newNode;
    }

    
    public static int pop() {
        if(isEmpty()) {
            return -1;
        }
//  top is a temporary variable in which head will go
        Node top = head;
// head will go one node below and the previous head will be non - existent
        head = head.next;
        return top.data;
    }
//peek is top most node ka data
    public static int peek() {
        if(isEmpty()) {
            return -1;
        }
        Node top = head;
        return top.data;
    }
}

public static void main(String args[]) {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    while(!stack.isEmpty()) {
        System.out.println(stack.peek());
        stack.pop();
    }
}
}
