public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 3, 6, 7, 9};
        int target = 9;

        int[] result = s.twoSum(nums, target);

        if (result != null) {
            System.out.println("Indexes found: " + result[0] + ", " + result[1]);
        } else {
            System.err.println("No combination found!");
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
