import java.util.*;

// Question 1.5: There are three types of edits that can be performed on strings:
// insert a character, remove a character, or replace a character.
// Given two strings, write a function to check if they are one edit (or zero edits) away.

public class q1p5 {

  private static boolean isEditAway(String input1, String input2) {
    int input1_length = input1.length();
    int input2_length = input2.length();

    if (input1_length == input2_length) {
      return isReplacementAway(input1, input2);
    } else if (input1_length + 1 == input2_length) {
      return isInsertionAway(input1, input2);
    } else if (input2_length + 1 == input1_length) {
      return isInsertionAway(input2, input1);
    }

    return false;
  }

  private static boolean isReplacementAway(String input1, String input2) {
    boolean foundDifference = false;

    for (int i = 0; i < input1.length(); i++) {
      if (input1.charAt(i) != input2.charAt(i)) {
        if (foundDifference) {
          return false;
        }
        foundDifference = true;
      }
    }

    return true;
  }

  private static boolean isInsertionAway(String input1, String input2) {
    // input1 is the smaller string. Checking if adding one character will make it into input2.

    int index1 = 0;
    int index2 = 0;

    while (index1 < input1.length() && index2 < input2.length()) {
      if (input1.charAt(index1) == input2.charAt(index2)) {
        index1++;
        index2++;
      } else {
        if (index1 != index2) {
          return false;
        }
        index2++;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println(isEditAway(args[0], args[1]));
  }
}
