import java.util.Collections;
import java.util.HashMap;

public class MostCommonCharacter {
  /**
   * Find the most common character in str.
   * You could use a HashMap that maps a Character key to an Int value to
   * represent how many times a Character has
   * been spotted.
   * 
   * @param str A String.
   * @return the most common character within str.
   */
  public char recurringChar(String str) {
    HashMap<String, Integer> hm = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      String s = Character.toString(str.charAt(i));
      if (hm.get(s) == null) {
        hm.put(s, 1);
      } else {
        hm.put(s, hm.get(s) + 1);
      }
    }

    int max = Collections.max(hm.values());
    for (String s : hm.keySet()) {
      if (hm.get(s) == max) {
        return s.charAt(0);
      }
    }
    return (Character) null;

  }
}
