package Warmup1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Warmup {

    public static void main(String[] args) {


        int number = 98;

        int abs = Math.abs(number);

        //System.out.println(abs);

        //String name = "bigos";

        //System.out.println(missingChar("Kitten", 1));


        //System.out.println(frontBack("code"));

        //System.out.println(front3("Java"));


        //System.out.println(front22("kitten"));


        //System.out.println(startOz("ozymandias"));

        //System.out.println(intMax(6,3,2));

        //System.out.println(close10(9,13));

        //System.out.println(max1020(23,10));


        //System.out.println(delDel("del"));

        //System.out.println(stringE("Heellee"));

       // System.out.println(endUp("woo hoo"));

        System.out.println(everyNth("Miracle", 2));


    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
        // The above can be shortened to:
        //   return ((aSmile && bSmile) || (!aSmile && !bSmile));
        // Or this very short version (think about how this is the same as the above)
        //   return (aSmile == bSmile);
    }

    public int sumDouble(int a, int b) {

        if (a == b) {
            return (a + b) * 2;
        } else {
            return a + b;
        }


    }

    /*

        Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.


                notString("candy") → "not candy"
        notString("x") → "not x"
        notString("not bad") → "not bad"
     */


    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }





        return "not " + str;

    }

/*

    Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).


    missingChar("kitten", 1) → "ktten"
    missingChar("kitten", 0) → "itten"
    missingChar("kitten", 4) → "kittn"
    */



    public static String missingChar(String str, int n) {


/*
        char[] myChar = str.toCharArray();

        myChar[n] = ' ';
        String newStr = String.valueOf(myChar);
*/

    String first = str.substring(0,n);

    String second = str.substring((n+1), str.length());

    String newStr = first+second;

     //Stringbuilder sb --> sb.deleteAtindex



        return newStr;
    }


/*
    Given a string, return a new string where the first and last chars have been exchanged.


    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
    */

    public static String frontBack(String str) {
        //StringBuilder sb = new StringBuilder(str);


        //sb.setCharAt(0, 'p');
        //return str.charAt((str.length()-1) + str.charAt(1));

        //code





           String first = str.substring(0, 1);
         String mid = str.substring(1, (str.length()-1));
           String last = str.substring((str.length()-1));


           String value = last+mid+first;





        return value;

    }


    public static String front3(String str) {

        if((str.length()<3)) {
            return str;
        }


        System.out.println("Ostatni String " +
                "\n" + str +
                "  String lastStr = str.substring((str.length()-1), (str.length()-1));\n" +
                "  ");

        String first3 = str.substring(0,3);


        String newStr = first3+first3+first3;


        return newStr;

    }




    public static String backAround(String str) {



        String lastString = str.substring(str.length()-1);

    return lastString;


    }


    public static boolean or35(int n) {

        //return ((n%5==0) || (n%3==0));


            return ((n%5==0) || (n%3==0));

    }


   /* Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.


            front22("kitten") → "kikittenki"
    front22("Ha") → "HaHaHa"
    front22("abc") → "ababcab"*/


    public static String front22(String str) {



        if(str.length()<=2) return str+str+str;

        String firstTwoLetters = str.substring(0,2);

        return firstTwoLetters + str + firstTwoLetters;
            //kitten

        //"kikitten ki"  --> kitten ki


    }


/*
    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false

*/

    public boolean mixStart(String str) {

        if(str.length()<=2) {
            return false;
        }


        String ix = str.substring(1,3);
        String mix = str.substring(0,3);

        //return(ix.equals."ix"));
        if((ix.equals("ix")) || (mix.equals("mix"))) {
            return true;
        } else {
            return false;
        }



    }
    public static String startOz(String str) {

        String result = "";

        if(str.length()<=2) return result+str;

        // zwrocic stringa zrobionego z 2 liter
        // pierwsza litere uwzglednic jesli jest to 0
        // druga litere uwzglednic jesli jest to z



        String first = str.substring(0,1);
        String second = str.substring(1,2);

        if(  ((first.equals("o"))) && (second.equals("z"))){
            return result+first+second;
        } else if((second.equals("z"))){
            return result+second;
        } else if((first.equals("o"))) {
            return result + first;
        }



        return result;
     /*   public String startOz(String str) {
            String result = "";

            if (str.length() >= 1 && str.charAt(0)=='o') {
                result = result + str.charAt(0);
            }

            if (str.length() >= 2 && str.charAt(1)=='z') {
                result = result + str.charAt(1);
            }

            return result;
        }*/


    }

    public static int intMax(int a, int b, int c) {
/*
        Given three int values, a b c, return the largest.


                intMax(1, 2, 3) → 3
        intMax(1, 3, 2) → 3
        intMax(3, 2, 1) → 3*/

        int maxFirst = Math.max(a,b);
        int maxSecond = Math.max(maxFirst,c);

return maxSecond;


    }



/*

    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


            close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0
*/



    public static int close10(int a, int b) {

    // ich wartosc jest najblizej 10

        int minReturn = 0;
        int valueA = Math.abs(a-10);
        int valueB = Math.abs(b-10);

        if(Integer.valueOf(valueA).equals(valueB)) {
            return 0;
        }

        if(valueA < valueB) {
            return a;
        } else {
            return b;
        }

    }



   /* Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.


            in3050(30, 31) → true
    in3050(30, 41) → false
    in3050(40, 50) → true
*/
    public boolean in3050(int a, int b) {


        return (((a>=30) && (a<=40)) && ((b>=30) && (b<=40))) ||

                ((a>=40) && (a<=50)) &&  ((b>=40) && (b<=50));


    }


/*
    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.


            max1020(11, 19) → 19
    max1020(19, 11) → 19
    max1020(11, 9) → 11
    public int max1020(int a, int b) {
  // First make it so the bigger value is in a
  if (b > a) {
    int temp = a;
    a = b;
    b = temp;
  }

  // Knowing a is bigger, just check a first
  if (a >= 10 && a <= 20) return a;
  if (b >= 10 && b <= 20) return b;
  return 0;
}
*/
public static int max1020(int a, int b) {
// 11, 19 --> 19
// 23, 10 --> 10
    int max = Math.max(a,b);
    int min = Math.min(a,b);

    if((max>=10)&&(max<=20)){
        return max;
    }

    if((min>=10)&&(min<=20)) {

        return min;


    }



return 0;


}
/*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.


    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false*/

    public static boolean loneTeen(int a, int b) {


        if((a<=19 && a>=13) && (b<=19 && b>=13) || ((a>19) && (b>19))) return false;


        return true;



    }
/*
    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


            delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
    delDel("adedbc") → "adedbc"*/


    public static String delDel(String str) {
        if((str.length()<=3) && (!str.equals("del")) || str.equals("del")) {
            return str;
        }

        if(str.substring(1,4).equals("del")) {
            String first = str.substring(0,1);
            String rest = str.substring(4, str.length());
            return first+rest;

        }



        return str;



    }


   /* Return true if the given string contains between 1 and 3 'e' chars.

            stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false*/



    public static boolean stringE(String str) {

        int count = 0;


        for(int i=0; i<str.length(); i++){

            if(str.charAt(i) == 'e') {
                count++;
            }

        }

        return (count <=3 && count>=1);



    }


  /*  Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
    lastDigit(7, 17) → true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true
*/
  public boolean lastDigit(int a, int b) {

      int max = Math.max(a,b);
      int min = Math.min(a,b);

      int reminder = max%10;

      if(reminder==min) return true;

      return false;

  }

    public static String endUp(String str) {
        //hi there --> hi thERE
        if(str.length()<3) {
            return str.toUpperCase();
        }

        String makeUpper = str.substring(str.length()-3).toUpperCase();

         String firstPart = str.substring(0, str.length()-3);
         return firstPart+makeUpper;



    }



/*
    Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"
*/


    public static String everyNth(String str, int n) {

        // usunac wybrany enty (n) string

        //Miracle --> Mrce

//Mi acle
        String empty = "";

            for(int i=0; i<str.length(); i+=n) {

                empty = empty + str.charAt(i);

            }



        return empty;


    }

}





























