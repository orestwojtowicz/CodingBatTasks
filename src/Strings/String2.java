package Strings;

/**
 * Created by damiass on Jan, 2020
 */
public class String2 {

    public static void main(String[] args) {


        String abc = "abc";
        String other = "abXabc";

        System.out.println(other.substring(3));





/*    Given a string, return a string where for every char in the
      original, there are two chars

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"*/
    }

    public String doubleChar(String str) {

        String temp = "";
        for (int i = 0; i < str.length(); i++) {

            temp = temp + str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return temp;
    }

    /*    Return the number of times that the string "hi"
         appears anywhere in the given string.

        countHi("abc hi ho") → 1
        countHi("ABChi hi") → 2
        countHi("hihi") → 2*/
    public int countHi(String str) {

        String hi = "hi";
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).contains(hi)) {
                counter++;
            }
        }
        return counter;
    }


    public boolean catDog(String str) {

        int cat = 0;
        int dog = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                cat++;
            } else if (str.substring(i, i + 3).equals("dog")) {
                dog++;
            }
        }
        return dog == cat ? true : false;
    }

    public int countCode(String str) {


        int counter = 0;

        for (int i = 0; i < str.length() - 3; i++) {

            if ((str.substring(i, 2).contains("co")) && ((str.substring(i, 3).contains("e")))) {
                counter++;
            }
        }
        return counter;

    }

    /*
        Given two strings, return true if either of the strings appears at the very end of the other string, ignoring
        upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
       */
    public boolean endOther(String a, String b) {

        // compare length of Strings
        // take shorter and compare whole shorter String to end of second String by given length
        // endOther("AbC", "HiaBc") → true

        a = a.toLowerCase();
        b = b.toLowerCase();
        String temp;
        if (a.length() >= b.length()) {
            temp = a.substring(a.length() - b.length());
            if (temp.equals(b)) return true;
        } else {
            temp = b.substring(b.length() - a.length());
            if (temp.equals(a)) return true;
        }

        return false;
    }

   // Return true if the given string contains an appearance of "xyz" where the xyz is not directly
    // preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
   public boolean xyzThere(String str) {

       // liczy sie jesli xxyz, xyz. NIE LICZY SIE x.xyz
       return str.replace(".xyz", "").contains("xyz");

   }


  //  Return true if the given string contains a "bob" string
    //  , but where the middle 'o' char can be any char.
  public boolean bobThere(String str) {

      for (int i = 0; i < str.length() - 2; i++) {
          if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b' ) {
              return true;
          }
      }
      return false;
  }

}
