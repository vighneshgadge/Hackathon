package UniqueNumber;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class UniqueNumbersCounter {

    public String findUniqueNumbersCount(int[] nums, int k) {
        // Check for invalid inputs
        if (nums == null) {
            return "Give proper input, not null array";
        }
        if (nums.length == 0) {
            return "Give proper input, not empty array";
        }
        if (k <= 0) {
            return "Give proper input, sub array length can not be negative or zero";
        }
        if (k > nums.length) {
            return "Give proper input, sub array length exceeds array length";
        }

        // Use a Deque to store the elements of the subarray
        Deque<Integer> deque = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        int maxCount = 0;

        // Iterate over the elements of the array
        for (int i = 0; i < nums.length; i++) {
            // Remove the element that is no longer part of the subarray
            if (i >= k && !deque.isEmpty() && deque.peekFirst() <= i - k) {
                int removed = deque.removeFirst();
                set.remove(nums[removed]);
            }
            // Add the current element to the subarray
            if (set.add(nums[i])) {
                deque.addLast(i);
            }
            // Update the maximum count of unique elements if necessary
            if (deque.size() > maxCount) {
                maxCount = deque.size();
            }
        }

        return "Count of Unique Numbers is " + maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println();
        int size = sc.nextInt();
        int []array = new int[size];
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();

        }

//        int[]  array = {4,5,2,1,2};
        int  subArrayLength = sc.nextInt();
        UniqueNumbersCounter s = new UniqueNumbersCounter();
        System.out.println(s.findUniqueNumbersCount(array, subArrayLength));


    }

}