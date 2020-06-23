package saud;

public class HashTable<K, V> {

  final static int ARR_LENGTH = 10;
  Object[] arr; // eventually see if some way to specify type of array once we know it in constructor / at runtime

  public HashTable() {
    arr = new Object[ARR_LENGTH]; // using 10 as length for now, eventually use dynamic ArrayList once that is implemented
    // continue from here
  }

  public void add(K key, V value) {
    int hashCode = key.hashCode(); // later, implement custom hashing function(s)
    int index = hashCode % ARR_LENGTH;

    if (arr[index] == null) {
      //arr[index] = new SinglyLinkedList<>(4);
    }
    // continue from here
  }
}
