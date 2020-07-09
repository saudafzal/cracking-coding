import java.util.*;

// Question 2.2: Check Permutation: Given two strings,write a method to decide if one
// is a permutation of the other.

public class q1p2 {

  private static void swap(char[] arr, int a, int b) {
    char temp;
    if (a == b) { return; }
    temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  // vv inefficient sorting algorithm, improve later
  private static String sorted(String input) {
    char[] inputArray = input.toCharArray(); // Also apparently there is a built-in java method to sort an array.
    int minIndex;
    for (int i = 0; i < inputArray.length; i++) {
      minIndex = i;
      for (int j = i+1; j < inputArray.length; j++) {
        if (inputArray[j] < inputArray[minIndex]) { minIndex = j; }
      }
      swap(inputArray, i, minIndex);
    }
    return String.valueOf(inputArray);
  }

  private static boolean isPermutation(String a, String b) {
    if (a.length() != b.length()) {return false; }
    return sorted(a).equals(sorted(b));
  }

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Please enter two strings.");
      return;
    }
    if (isPermutation(args[0], args[1])) {
      System.out.println("The strings are permutations of each other.");
    } else {
      System.out.println("The strings are not permutations of each other.");
    }
  }
}
