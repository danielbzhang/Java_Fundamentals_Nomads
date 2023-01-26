import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
  /**
   * An Isogram is a word where no letters are repeated. You may assume that there
   * will only be lowercase
   * letters in the String.
   *
   * For instance, "cat", "isogram", "uncopyrightable" are isograms. "egg",
   * "java", "programming" are not.
   * You could use a Set of characters or a Map of characters to int or boolean to
   * solve this problem.
   * You could even solve it with an array of 26 booleans, and convert characters
   * to an index of that array.
   * It's also possible to solve this with nested for loops.... but it's not as
   * easy or efficient.
   *
   * @param str a String.
   * @return true if str is an isogram, false otherwise.
   */
  public boolean isIsogram(String str) {
    // Method 1:

    HashMap<Character, Integer> hs = new HashMap<>();
    str = str.toLowerCase();
    for (int i = 0; i < str.length(); i++) {
      Integer res = hs.get(str.charAt(i));
      if (res == null) {
        hs.put(str.charAt(i), 1);
        // res = 1; False to do so.
      } else {
        // res += 1;
        hs.put(str.charAt(i), hs.get(str.charAt(i)) + 1);
      }
    }

    // System.out.println(hs);
    for (Integer c : hs.values()) {
      if (c > 1) {
        return false;
      }
    }
    return true;

    // Method 2:

    // String[] myArr = str.split("");
    // Set<String> mySet = new HashSet<String>(Arrays.asList(myArr));

    // if(mySet.size() == myArr.length) {
    // return true;
    // }
    // return false;
  }

  public static void main(String[] args) {
    Isogram exm = new Isogram();
    System.out.println(exm.isIsogram("Nick"));
    System.out.println(exm.isIsogram("Java"));

  }
}