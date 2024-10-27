package Top_Interview_150.Java;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    // Solution 1: Using Hashmaps (16ms runtime)
    public int majorityElement(int[] nums) {
        int majorityElement = 0;
        int count = nums.length/2;
        Map<Integer, Integer> elementCounter = new HashMap<>();

        for (int num : nums){
            elementCounter.put(num, elementCounter.getOrDefault(num, 0) + 1);
            if(count <= elementCounter.get(num)){
                count = elementCounter.get(num);
                majorityElement = num;
            }
        }
        return majorityElement;
    }

    // Solution 2: Boyer-Moore Voting Algorithm (2ms runtime)
    public int majorityElementOptimized(int[] nums) {
        int majorityElement = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                majorityElement = num;
                count = 1;
            } else if (num == majorityElement) {
                count++;
            } else {
                count--;
            }
        }
        return majorityElement;
    }

}

/* --- Notes ---
 * Hasmap usage:
 *  elmentCounter.getOrDefault(num, 0): 
 *      - checks if the key num (the current element) is already in the HashMap
 *      - If num is found, it retrieves its current count.
 *      - If num is not found (the element hasn't appeared before), it defaults to 0
 *  Adding 1:
 *      -  After retrieving the current count (or the default of 0), it adds 1 to this value to update the count of occurrences.
 *  occurrences.put(num, ...): 
 *      - Stores this updated count back in the HashMap, associating it with the key num.  
 * 
 *  Solution 1:
 *      - Time complexity: O(n) - We iterate through the array once, so the time complexity is linear.
 *      - Space complexity: O(n) - We use a HashMap to store the count of each unique element. In the worst case (all elements are unique), this could take linear space.
 * 
 * Solution 2:
 *      - Time complexity: O(n) - We iterate through the array once, so the time complexity is linear.
 *      - Space complexity: O(1) - This algorithm uses a constant amount of space, regardless of the input size. It only maintains two variables (majorityElement and count).
 * 
 * For large input sizes, the Boyer-Moore algorithm is superior. However, it only works if there's a majority element surely exist in the data set.
 */