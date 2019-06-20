package array;

public class Array2 {
    public static void main(String[] args) {


        int[] nums = {5, 6, 45, 99, 13, 5, 6};


        fizzArray3(11, 18);


    }


    // Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder,
    // e.g. 5 % 2 is 1.

    public int countEvens(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }


    // Given an array length 1 or more of ints, return the difference between the largest
    // and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2)
    // methods return the smaller or larger of two values.
    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max)
                max = nums[i];

            if (nums[i] < min) {
                min = nums[i];
            }
        }


        return max - min;
    }


    // Return the "centered" average of an array of ints, which we'll say is the mean average
    // of the values, except ignoring the largest and smallest values in the array. If there are
    // multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
    public int centeredAverage(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

        }

        int minMax = min(nums) + max(nums);
        sum -= minMax;

        return sum / ((nums.length) - 2);
    }

    public int min(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public int max(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }


    /*  Return the sum of the numbers in the array, returning 0 for an empty array.
      Except the number 13 is very unlucky, so it does not count and numbers that come
      immediately after a 13 also do not count.
  */
    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                nums[i] = 0;
                if (nums.length > i + 1) {
                    nums[i + 1] = 0;
                }
            }
            sum += nums[i];
        }
        return sum;
    }

/*    Return the sum of the numbers in the array, except
    ignore sections of numbers starting with a 6 and extending to
    the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.*/

    public int sum67(int[] nums) {
        int sum = 0;

        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 6 && flag == false) {
                sum = sum + nums[i];
            }
            if (nums[i] == 6) {
                flag = true;
            } else if (nums[i] == 7) {
                flag = false;
            }


        }
        return sum;
    }


    // Given an array of ints, return true if the
    // array contains a 2 next to a 2 somewhere.

    public boolean has22(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 2) && (nums[i + 1] == 2))
                return true;

        }
        return false;
    }

    // Given an array of ints, return true if the array contains no 1's and no 3's.
    public boolean lucky13(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }

        }
        return true;

    }


    // Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
    public boolean sum28(int[] nums) {

        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 2) {
                counter++;
            }
        }
        if (counter == 4) return true;

        return false;
    }

    // Given an array of ints, return true if the number of 1's is greater than the number of 4's
    public boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) count1++;
            if (nums[i] == 4) count4++;
        }
        if (count1 > count4) return true;
        return false;
    }

/*    Given a number n, create and return a new int array of length n,
    containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just
    return a length 0 array. You do not need a separate if-statement for the length-0 case;
    the for-loop should naturally execute 0 times in that case, so it just works. The syntax to
    make a new int array is: new int[desired_length]   (See also: FizzBuzz Code)*/

    public int[] fizzArray(int n) {

        int myArray[] = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = i;
        }

        return myArray;

    }

    // Given an array of ints, return true if every element is a 1 or a 4.
    public boolean only14(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 1 && nums[i] != 4) return false;

        }

        return true;

    }
    // Given a number n, create and return a new string array of
    // length n, containing the strings "0", "1" "2" .. through n-1. N may
    // be 0, in which case just return a length 0 array. Note: String.valueOf(xxx)
    // will make the String form of most types. The syntax to make a new string array is:
    // new String[desired_length]  (See also: FizzBuzz Code)

    public String[] fizzArray2(int n) {

        String newArr[] = new String[n];

        for (int i = 0; i < n; i++) {
            newArr[i] = String.valueOf(i);
        }

        return newArr;


    }
    // Given an array of ints, return true if it contains no 1's or it contains no 4's.

    public boolean no14(int[] nums) {

        boolean has1 = false;
        boolean has4 = false;

        for (int n : nums) {
            if (n == 1) {
                has1 = true;
            } else if (n == 4) {
                has4 = true;
            }
        }

        return !has1 || !has4;

    }

    // We'll say that a value is "everywhere" in an array if for
    // every pair of adjacent elements in the array, at least one of the
    // pair is that value. Return true if the given value is everywhere in the array.
    public boolean isEverywhere(int[] nums, int val) {


        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }

        }
        return true;


    }

    // Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.


    public boolean either24(int[] nums) {

        int twos = 0;
        int fours = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if ((nums[i] == 2 && nums[i + 1] == 2)) {
                twos++;
            }

            if ((nums[i] == 4 && nums[i + 1] == 4)) {
                fours++;
            }

        }

        if (twos == 1 && fours == 1) return false;

        if (twos == 1 || fours == 1) return true;


        return false;

    }

    // Given arrays nums1 and nums2 of the same length,
    // for every element in nums1, consider the corresponding element
    // in nums2 (at the same index). Return the count of the number of times that
    // the two elements differ by 2 or less, but are not equal.
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i])
                count++;
        }

        return count;
    }

    // Given an array of ints, return true if the array
    // contains two 7's next to each other, or there are two 7's
    // separated by one element, such as with {7, 1, 7}.


    public boolean has77(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 7 && nums[i + 1] == 7) return true;
            if ((i <= nums.length - 3 && (nums[i] == 7 && nums[i + 2] == 7))) return true;

        }

        return false;

    }

    // Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
    public boolean has12(int[] nums) {

        boolean hasOne = false;
        boolean hasTwo = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) hasOne = true;
            if (hasOne && nums[i] == 2) hasTwo = true;

        }

        return hasOne && hasTwo;

    }

    // Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
    public boolean modThree(int[] nums) {

        if (nums.length < 3) return false;

        boolean result = false;

        for (int i = 0; i < nums.length - 2; i++)

            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0)
                    || (!(nums[i] % 2 == 0) && !(nums[i + 1] % 2 == 0) && !(nums[i + 2] % 2 == 0)))

                result = true;

        return result;

    }

// Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


    public boolean haveThree(int[] nums) {

        int count = 0;


        for (int i = 0; i < nums.length - 1; i++) {

            if ((nums[i] == 3 && nums[i + 1] != 3))
                count++;


        }
        if (nums.length > 1 && nums[nums.length - 1] == 3 && nums[nums.length - 2] != 3)
            count++;

        if (count == 3) return true;

        return false;

    }


    public boolean sameEnds(int[] nums, int len) {


        // len -> numbs from start nums[len] compare to end arr nums[nums.length-len]


        for (int i = 0; i < len; i++) {


            if (nums[i] != nums[nums.length - len + i]) return false;

        }


        return true;

    }


    public boolean tripleUp(int[] nums) {


        for (int i = 0; i < nums.length - 2; i++) {

            if (((nums[i] - nums[i + 1]) == -1) && ((nums[i + 1] - nums[i + 2])) == -1)
                return true;


        }

        return false;

    }

    public static int[] fizzArray3(int start, int end) {


        int[] newArr = new int[end - start];

        for (int i = 0; i < newArr.length; i++) {

            newArr[i] = start;
            start++;




        }
        return newArr;
    }

/*      public boolean twoTwo(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 2) {
                    if (!(i < nums.length-1 && nums[i+1] == 2 ||
                            nums.length > 1 && i > 0 && nums[i-1] == 2))
                        return false;
                }
            }
            return true;
        }*/
        // Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
        // You may modify and return the given array, or return a new array.

    public int[] shiftLeft(int[] nums) {

        if(nums.length < 1) return nums;

        for(int i=1; i<nums.length; i++) {

            nums[i-1] = nums[i];

        }



        return nums;


    }
}

































