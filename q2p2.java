import saud.*;

// Question 2.2: Implement an algorithm to find the kth to last element of a singly linked list.
// Idea 1: Have two runners, the first starting at beginning of the list, the second initially places k positions ahead of the first.
// While loop, increment both, if the second runner is at node whose next is null, return the value at node where first runner is.
// Time complexity: O(n). Space complexity: O(1).
// Solution inspired by the answer in the book.

public class q2p2 {

  static SinglyLinkedNode<String> kToLast(SinglyLinkedList<String> theList, int k) {
    SinglyLinkedNode<String> a = theList.head();
    SinglyLinkedNode<String> b = theList.head();

    for (int i = 0; i < k + 1; i++) {
      b = b.next();
    }

    while (b != null) {
      a = a.next();
      b = b.next();
    }

    return a;
  }

  public static void main (String[] args) {

    SinglyLinkedList<String> myList = new SinglyLinkedList<>("a");
    myList.appendToTail("b");
    myList.appendToTail("c");
    myList.appendToTail("d");
    myList.appendToTail("e");

    System.out.println(myList);

    System.out.println("The 1 to last element is: " + kToLast(myList, 1).data());
    System.out.println("The 2 to last element is: " + kToLast(myList, 2).data());
    System.out.println("The 3 to last element is: " + kToLast(myList, 3).data());
    System.out.println("The 4 to last element is: " + kToLast(myList, 4).data());

  }

}
