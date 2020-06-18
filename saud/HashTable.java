package saud;

public class HashTable {

  final static int ARR_LENGTH = 10;
  SinglyLinkedList[] arr;

  // the hashCode is the sum of each character of the string's numerical representation
  int hashCode(String key) {
    int theCode = 0;

    for (int i = 0; i < key.length(); i++) {
      theCode += key.charAt(i);
    }

    return theCode;
  }

  public HashTable() {
    arr = new SinglyLinkedList[ARR_LENGTH]; // using 10 as length for now, eventually use dynamic ArrayList once that is implemented
  }

  public void add(String key, String value) {
    int hashCode = hashCode(key);
    int index = hashCode % ARR_LENGTH;

    if (arr[index] == null) {
      arr[index] = new SinglyLinkedList // stopping here because realized I really need to add generic type functionality to my linked lists before I can go any further
    }
  }
}
