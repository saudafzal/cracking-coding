import java.util.Random;
import java.util.*;

// Question 2.1: Remove Dups: Write code to remove duplicates from an unsorted linked list.
// FOLLOW UP: How would you solve this problem if a temporary buffer is not allowed?

// Using Java standard packages, not my own.

public class q2p1 {

  static Random randy = new Random();

  // removing duplicates, buffer allowed
  static void removeDups(LinkedList theList) {
    Hashtable<Object, Boolean> myTable = new Hashtable<>();

    // problem with indices. when removing stuff, the indices get messed up, some stuff is skipped over
    for (int i = 0; i < theList.size(); i++) {
      if (myTable.containsKey(theList.get(i))) {
        theList.remove(i);
      } else {
        myTable.put(theList.get(i), true);
      }
    }
  }

  static void printList(LinkedList theList) {
    for (int i = 0; i < theList.size(); i++) {
      System.out.println(theList.get(i));
    }
  }

  public static void main(String[] args) {

    LinkedList<Integer> myList = new LinkedList<>();

    System.out.println("***BEFORE***");

    for (int i = 0; i < 5; i++) {
      myList.add(randy.nextInt(3));
    }

    printList(myList);

    removeDups(myList);

    System.out.println("***AFTER***");

    printList(myList);

  }
}
