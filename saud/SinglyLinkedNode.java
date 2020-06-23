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

}
