// // import LL.java;

// public class Mergelist {
//   //1. declare head and size
//   Node head;
//   //2. initialize size
//   int size = 0;
//   //3.  Node class
//   public class Node {
//     // declare data and next
//       int data;
//       Node next;
//     // Node constructor
//     public Node(int data) {
//         //data , next
//           this.data = data;
//           this.next = null;
//         //size increment
//           size++;
//       }
//   }


// public static LL merge( LL first , LL second){

//  Node f = first.head;
//  Node s = second.head;

//   LL ans= new LL();

//   while(f !=null && s!= null){
//     if(f.data < s.data){
//       ans.addLast(f.data);
    
//     }else{
//       ans.addLast(s.data);
      
//       }
//   }

//   while(f != null){
//     ans.addLast(f.data);
//     f = f.next;
//   }
//   while(s != null){
//     ans.addLast(s.data);
//     s = s.next;
//   }
// }
// public static void main(String[] args) {
//   LL first = new LL();
//   LL second = new LL();


//   first.addLast(1);
//   first.addLast(3);
//   first.addLast(5);

//   second.addLast(1);
//   second.addLast(2);
//   second.addLast(9);
//   second.addLast(14);

//   LL ans = LL.merge(first,second)
//   ans.display();
// }
// }
