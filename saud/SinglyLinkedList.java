package saud;

public class SinglyLinkedList<T> {

  SinglyLinkedNode<T> head;

  public SinglyLinkedList(T d) {
    head = new SinglyLinkedNode<T>(d);
  }

  public SinglyLinkedList(SinglyLinkedNode<T> head) {
    this.head = head;
  }

  public SinglyLinkedList(T[] arr) {
    head = new SinglyLinkedNode<T>(arr[0]);

    for (int i = 1; i < arr.length; i++) {
      this.appendToTail(arr[i]);
    }
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

  public void appendToTail(SinglyLinkedNode<T> theNode) {
    SinglyLinkedNode<T> current = head;

    while (current.next != null) {
      current = current.next;
    }

    current.next = theNode;
  }

  public void printList() {
    System.out.print("[");
    printListHelper(head);
    System.out.println();
  }

  // implement toString() at some point
  // also implement a method to append a node by passing the node, instead of passing the data to be contained in the node

  private void printListHelper(SinglyLinkedNode<T> start) {
    if (start.next == null) {
      System.out.print(start.data + "]");
    } else {
      System.out.print(start.data + ", ");
      printListHelper(start.next);
    }

  }
}
