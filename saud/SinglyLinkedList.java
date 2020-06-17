package saud;

public class SinglyLinkedList {

  SinglyLinkedNode head;

  public SinglyLinkedList(int d) {
    head = new SinglyLinkedNode(d);
  }

  public void appendToTail(int d) {
    SinglyLinkedNode current = head;

    while (current.next != null) {
      current = current.next;
    }

    current.next = new SinglyLinkedNode(d);
  }

  public void printList() {
    System.out.print("[");
    printListHelper(head);
    System.out.println();
  }

  private void printListHelper(SinglyLinkedNode start) {
    if (start.next == null) {
      System.out.print(start.data + "]");
    } else {
      System.out.print(start.data + ", ");
      printListHelper(start.next);
    }

  }
}
