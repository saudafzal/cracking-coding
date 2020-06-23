package saud;

public class SinglyLinkedList<T> {

  SinglyLinkedNode<T> head;

  public SinglyLinkedList(T d) {
    head = new SinglyLinkedNode<T>(d);
  }

  public SinglyLinkedNode<T> head() {
    return head;
  }
  
  public void appendToTail(T d) {
    SinglyLinkedNode<T> current = head;

    while (current.next != null) {
      current = current.next;
    }

    current.next = new SinglyLinkedNode<T>(d);
  }

  public void printList() {
    System.out.print("[");
    printListHelper(head);
    System.out.println();
  }

  private void printListHelper(SinglyLinkedNode<T> start) {
    if (start.next == null) {
      System.out.print(start.data + "]");
    } else {
      System.out.print(start.data + ", ");
      printListHelper(start.next);
    }

  }
}
