import saud.*;
import java.util.Random;

// Question 2.1: Remove Dups: Write code to remove duplicates from an unsorted linked list.
// FOLLOW UP: How would you solve this problem if a temporary buffer is not allowed?

public class q2p1 {

  static Random randy = new Random();

  // creates list of length length with random integers range 0-9 incl.
  static SinglyLinkedList genList(int length) {
    SinglyLinkedList myList = new SinglyLinkedList(randy.nextInt(10));
    for (int i = 1; i < length; i++) {
      myList.appendToTail(randy.nextInt(10));
    }
    return myList;
  }

  // creates list of random length range 0-99 with random integers range 0-9 incl.
  static SinglyLinkedList genList() {
    return genList(randy.nextInt(100));
  }

  // removing duplicates, buffer allowed
  static void removeDups(SinglyLinkedList theList) {
    
  }

  public static void main(String[] args) {

    // let's generate a list of length 11, thus ensuring at least one duplicate
    SinglyLinkedList myList = genList(11);
    myList.printList();
  }
}
