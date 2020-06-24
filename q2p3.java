import saud.*;

// Question 2.3: Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, not necessarily the exact middle)
// of a singly linked list, given only access to that node.
// Idea: Traverse through the list, checking the next of each node. When you reach the node whose next is the node to be removed,
// set the next to be the next of the node to be removed.
// Time complexity: O(n). Space complexity: O(1).
// Whoops, that doesn't work. I misunderstood the question. We only have access to the node to be removed, no access to the head of the list.
// New idea, inspired by book solution. Copy the data from the next of the node to be removed over to the node to be removed. Then remove the next.
// Timme complexity: O(1)? Space complexity: O(1)?

public class q2p3 {

  static void removeMiddleNode(SinglyLinkedNode<String> theNode) {
    theNode.setData(theNode.next().data());
    theNode.setNext(theNode.next().next());
  }

  public static void main(String[] args) {

    SinglyLinkedList<String> myList = new SinglyLinkedList<>("a");
    myList.appendToTail("b");
    myList.appendToTail("c");
    myList.appendToTail("d");
    myList.appendToTail("e");

    System.out.print("BEFORE: ");
    myList.printList();
    System.out.println();

    SinglyLinkedNode<String> toRemove = myList.head().next().next();

    removeMiddleNode(toRemove);

    System.out.print("AFTER: ");
    myList.printList();
    System.out.println();

  }
}
