package Warmup2;

public class Warmup2 {

    public static void main(String[] args) {


        //System.out.println(stringTimes("Hi",3));

        //System.out.println(frontTimes("Ab", 4));

        //System.out.println(countXX("Hello there"));
        //System.out.println(doubleX("xaxx"));

        System.out.println(stringBits("Chocoate"));

    }
/*

    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

            stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
*/


    public static String stringTimes(String str, int n) {

        String myString = "";

        for (int i = 0; i < n; i++) {
            myString = myString + str;
        }

        return myString;

    }


    public static String frontTimes(String str, int n) {

        if (str.length() < 3) {
            return str + str + str;
        }

        String readyStr = "";

        String first = str.substring(0, 3);

        for (int i = 0; i < n; i++) {
            readyStr = readyStr + first;

        }

        return readyStr;


    }


   /* Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3*/

    public static int countXX(String str) {

        int count = 0;

   /* for(int i=0; i<str.length()-1; i++){
        if(str.substring(i, i+2).equals("xx")) {
            count++;
        }


    }


    return count;*/

        // second way
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && (str.charAt(i + 1) == 'x')) {
                count++;
            }

        }

        return count;

    }

    static boolean doubleX(String str) {

        int count = 0;


        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    if (count >= 2) {
                        return true;
                    }


                }


            }

        }


        return false;

    }

/*
    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"
        delete every second char
    */


    protected static String stringBits(String str) {

        public String stringBits (String str){
            String result = "";

            for (int i = 0; i < str.length(); i += 2) {
                result = result + str.substring(i, i + 1);

            }
            return result;
        }


    }


}






















