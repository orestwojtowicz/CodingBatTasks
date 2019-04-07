package array;

public class Array1 {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4};

        System.out.println(makeMiddle(arr));


    }

    public boolean firstLast6(int[] nums) {

        if(nums.length<1) return false;

        if(nums[0]==6 || nums[nums.length-1]==6) return true;

        return false;


    }


    public boolean sameFirstLast(int[] nums) {

        if(nums.length >=1 && nums[0]==nums[nums.length-1]) return true;

        return false;

    }

    public int[] makePi() {

        int[] array = {3,1,4};

        return array;


    }
    //Given 2 arrays of ints, a and b, return true if they have the same first element or they have
    // the same last element. Both arrays will be length 1 or more.
    public boolean commonEnd(int[] a, int[] b) {

        if((a.length >=1 && b.length >=1) && (a[0]==b[0] || a[a.length-1]==b[b.length-1])) return true;


        return false;


    }
    public int sum3(int[] nums) {
        if(nums.length<3) return 0;

        return nums[0]+nums[1]+nums[2];

    }
    //Given an array of ints length 3, return an array with the elements
    // "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    public int[] rotateLeft3(int[] nums) {


        int[] arr = new int[nums.length];

        arr[0] = nums[1];
        arr[1] = nums[2];
        arr[2] = nums[0];

        return arr;



    }

 /*   Given an array of ints length 3,
        return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.*/

    public int[] reverse3(int[] nums) {

        int[] arr = {nums[2],nums[1],nums[0]};

        return arr;



    }

    // Given an array of ints length 3, figure out which is larger, the first or last element in the array,
    // and set all the other elements to be that value. Return the changed array.
    public int[] maxEnd3(int[] nums) {

        if(nums[0]>=nums[2]) {
            nums[1] = nums[0];
            nums[2] = nums[0];
        } else if (nums[2]>=nums[0]) {
            nums[0] = nums[2];
            nums[1] = nums[2];
        }



        return nums;

    }
    //Given an array of ints, return the sum of the first 2 elements in the array.
    // If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
    public int sum2(int[] nums) {

        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];

        return nums[0]+nums[1];



    }

    // Given 2 int arrays, a and b, each length 3,
    // return a new array length 2 containing their middle elements.
    public int[] middleWay(int[] a, int[] b) {

        int [] arr = {a[1], b[1]};

        return arr;

    }

/*
    //
    Given an array of ints, return a new array length 2
    containing the first and last elements from the original array. The original array will be length 1 or more.
*/

    public int[] makeEnds(int[] nums) {

        int[] arr = {nums[0], nums[nums.length-1] };


        return arr;

    }

//  boolean a = (nums[0] == 2 || nums[0] == 3) || (nums[1] == 2 || nums[1] == 3) ? true : false;

    public boolean has23(int[] nums) {

        if((nums[0] == 2 || nums[0]==3) || (nums[1]==2 || nums[1]==3)) return true;
// boolean a = (nums[0] == 2 || nums[0] == 3) || (nums[1] == 2 || nums[1] == 3) ? true : false;
        return false;

    }

    // (nums[0] == 2 || nums[0]==3) || (nums[1]==2 || nums[1]==3)
    public boolean no23(int[] nums) {

        boolean a = (nums[0] == 2 || nums[0]==3) || (nums[1]==2 || nums[1]==3) ? false:true;

        return a;

    }

   /* Given an int array, return a new array with double the length where its last element
    is the same as the original array, and all the other elements are 0. The original array
    will be length 1 or more. Note: by default, a new int array contains all 0's.*/



    public int[] makeLast(int[] nums) {

        int[] arr = new int[(nums.length*2)];

        arr[(arr.length-1)] = nums[(nums.length-1)];

        return arr;


    }


   // Given an int array, return true if the array
    // contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

    public boolean double23(int[] nums) {

        if(nums.length<=1) return false;

        boolean a = ((nums[0]==2 && nums[1]==2) || (nums[1]==3 && nums[0]==3 ))?true:false;

        return a;

    }


   // Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.


    public int[] fix23(int[] nums) { //if 3 after 2 then change 3 on 0
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        } else if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }


    // Start with 2 int arrays, a and b, of any length.
    // Return how many of the arrays have 1 as their first element.
    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }

/*
    Start with 2 int arrays, a and b, of any length.
    Return how many of the arrays have 1 as their first element.
    */

    public int[] biggerTwo(int[] a, int[] b) {

        int firstA = a[0] + a[1];
        int secondB = b[0] + b[1];

        if(firstA >= secondB ) return a;

        return b;

    }

 /*   Given an array of ints of even length, return a new array length 2
    containing the middle two elements from the original array. The original array will be length 2 or more.*/


    public int[] makeMiddle(int[] nums) {
        int middle = nums[(nums.length/2)-1];
        int next =  nums[(nums.length/2)];

        int[] arr = {middle, next};

        if(nums.length==2) return nums;


        return arr;




    }

    // Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.


    public int[] plusTwo(int[] a, int[] b) {
        int[] sum = {a[0], a[1], b[0], b[1]};
        return sum;
    }


   // Given an array of ints, swap the first and last elements
   // in the array. Return the modified array. The array length will be at least 1.

    public int[] swapEnds(int[] nums) {

        int first = nums[0];
        int last = nums[(nums.length-1)];

        nums[0] = last;
        nums[(nums.length-1)] = first;

        return nums;



    }

}



















