import java.util.*;

// String Compression: Implement a method to perform basic string compression using the counts
// of repeated characters. For example, the string aabcccccaaa would become a2blc5a3.
// If the "compressed" string would not become smaller than the original string, your method
// should return the original string. You can assume the string has only uppercase and lowercase letters.

// My solution works but I should use a StringBuilder instead of concatenating strings. Also, could
// consider implementing the book solution which computes length of final compressed string in advance
// to avoid compressing if original string can just be returned.

public class q1p6 {

  private static String compress(String input) {
    char currentChar = input.charAt(0);
    int currentCount = 1;
    String result = "" + currentChar;

    for (int i = 1; i < input.length(); i++) {
      if (input.charAt(i) == currentChar) {
        currentCount++;
      } else {
        result += currentCount;
        currentChar = input.charAt(i);
        result += currentChar;
        currentCount = 1;
      }
    }

    result += currentCount;

    if (result.length() < input.length()) {
      return result;
    } else {
      return input;
    }
  }

  public static void main(String[] args) {
    System.out.println(compress(args[0]));
  }
}
