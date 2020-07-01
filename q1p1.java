import java.util.*;

// Question 1.1: Is Unique: Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures?

public class q1p1 {

  // Using a hashtable
  private static boolean isUnique(String input) {
    Hashtable<Character, Boolean> h = new Hashtable<>();
    for (int i = 0; i < input.length(); i++) {
      if (h.containsKey(input.charAt(i))) {
        return false;
      } else {
        h.put(input.charAt(i), true);
      }
    }
    return true;
  }

  // Without using any additional structures
  private static boolean isUnique2(String input) {
    for (int i = 0; i < input.length(); i++) {
      for (int j = 0; j < input.length(); j++) {
          if (i != j && input.charAt(i) == input.charAt(j)) {
            return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Please enter one string.");
      return;
    }
    if (isUnique(args[0])) {
      System.out.println("The string \"" + args[0] + "\" contains all unique characters.");
    } else {
      System.out.println("The string \"" + args[0] + "\" does not contain all unique characters.");
    }
  }
}
