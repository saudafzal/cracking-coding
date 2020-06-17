import saud.*;

public class testLink {

  public static void main(String[] args) {

    SinglyLinkedList myList = new SinglyLinkedList(0);
    for (int i = 1; i < 6; i++) {
      myList.appendToTail(i);
    }

    myList.printList();

  }
}
