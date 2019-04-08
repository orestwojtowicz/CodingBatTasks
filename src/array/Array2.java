package array;

public class Array2 {
    public static void main(String[] args) {

    }


   // Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder,
    // e.g. 5 % 2 is 1.

    public int countEvens(int[] nums) {

        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]%2==0) {
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
        for(int i=0; i<nums.length; i++) {

            if(nums[i] > max)
                max = nums[i];

            if(nums[i]<min){
                min = nums[i];
            }
        }


        return max-min;
    }


   // Return the "centered" average of an array of ints, which we'll say is the mean average
   // of the values, except ignoring the largest and smallest values in the array. If there are
   // multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
    public int centeredAverage(int[] nums) {

        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum = sum + nums[i];

        }

        int minMax = min(nums) + max(nums);
        sum-=minMax;

        return sum/((nums.length)-2);
    }

    public int min(int[] nums) {
        int min = nums[0];
        for(int i=0; i<nums.length; i++) {
            if(nums[i]<min) {
                min = nums[i];
            }
        }
        return min;
    }

    public int max(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++) {

            if(nums[i]>max) {
                max = nums[i];
            }
        }
        return max;
    }



}
