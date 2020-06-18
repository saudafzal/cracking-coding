package saud;

public class HashTable {

  final static int ARR_LENGTH = 10;
  Object[] arr; // eventually see if some way to specify type of array once we know it in constructor / at runtime

  // the hashCode is the sum of each character of the string's numerical representation
  int hashCode(String key) {
    int theCode = 0;

    for (int i = 0; i < key.length(); i++) {
      theCode += key.charAt(i);
    }

    return theCode;
  }

  public HashTable() {
    arr = new Object[ARR_LENGTH]; // using 10 as length for now, eventually use dynamic ArrayList once that is implemented
    // continue from here
  }

  public void add(String key, String value) {
    int hashCode = hashCode(key);
    int index = hashCode % ARR_LENGTH;

    if (arr[index] == null) {
      arr[index] = new SinglyLinkedList<Integer>(4);
    }
    // continue from here
  }
}
