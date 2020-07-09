import java.util.*;

// Question 1.4: Palindrome Permutation: Given a string, write a function
// to check if it is a permutation of a palin­drome.

// Making a Hashtable<Character, Integer> and iterating through string to store counts of each
// char in the Hashtable. Then, iterate through Hashtable, counting the number of characters which
// have an odd count. If this number exceeds one, return false.

// There are still problems with my solution. For example, I have to change it so it ignores spaces.
// "Tact Coa", the example in the book, should be considered a palindrome permutation which it doesn't
// do currently. I should also probably have it accept the empty string as a valid input, and multiple
// words separated by spaces (again, as in the "Tact Coa" example). Also, my program is case-sensitive,
// which could be changed or made into an option selected by the user.

// In the book solution, they made a hashtable themselves using an array and with the assumption
// that the only characters we care about are a-z. That's an interesting and better solution.

public class q1p4 {

  private static boolean isPP(String input) {
    Hashtable<Character, Integer> myHashtable = new Hashtable<>();
    int numOdds = 0;

    // Iterating through the string and putting counts of each char into the Hashtable.
    for (int i = 0; i < input.length(); i++) {
      if (myHashtable.containsKey(input.charAt(i))) {
        myHashtable.put(input.charAt(i), myHashtable.get(input.charAt(i)) + 1);
      } else {
        myHashtable.put(input.charAt(i), 1);
      }
    }

    // A List of counts. Need to find a less convoluted way to make this.
    Integer[] countList = new Integer[myHashtable.size()];
    countList = myHashtable.values().toArray(countList);

    // Iterating through List of counts. If more than one count is odd, return false.
    for (int i = 0; i < countList.length; i++) {
      if (countList[i] % 2 == 1) {
        numOdds++;
        if (numOdds > 1) { return false; }
      }
    }

    return true; // No more than one count is odd, so return true.

  }

  public static void main(String[] args) {

    if (args.length != 1) {
      System.out.println("Please enter one string.");
      return;
    }

    if (isPP(args[0])) {
      System.out.println("The string \"" + args[0] + "\" is a palindrome permutation.");
    } else {
      System.out.println("The string \"" + args[0] + "\" is NOT a palindrome permutation.");
    }

    return;
  }

}
