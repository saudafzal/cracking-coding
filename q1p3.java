import java.util.*;

// Question 1.3: URLify: Write a method to replace all spaces in a string with '%20'.
// You may assume that the string has sufficient space at the end to hold the additional characters,
// and that you are given the "true" length of the string.

public class q1p3 {

  private static void URLify(char[] input, int length) {
    int spaces = 0;
    for (int i = 0; i < length; i++) {
      if (input[i] == ' ') { spaces++; }
    }
    int edge = (length - 1) + (spaces * 2);
    for (int j = length - 1; j >= 0; j--) {
      if (input[j] == ' ') {
         input[edge] = '0';
         input[edge - 1] = '2';
         input[edge - 2] = '%';
         edge -= 3;
      } else {
        input[edge] = input[j];
        edge -= 1;
      }
    }
  }

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Please enter a string and its true length.");
      return;
    }
    char[] arr = args[0].toCharArray();
    URLify(arr, Integer.parseInt(args[1]));
    String a = new String(arr);
    System.out.println(a);
  }
}
