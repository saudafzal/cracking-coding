package saud;

public class SinglyLinkedNode<T> {

    SinglyLinkedNode<T> next = null;
    T data;

    public SinglyLinkedNode(T d) {
	     data = d;
    }

    public SinglyLinkedNode<T> next() {
      return next;
    }

    public T data() {
      return data;
    }

    public void setNext(SinglyLinkedNode<T> next) {
      this.next = next;
    }

    public void setData(T data) {
      this.data = data;
    }
}
