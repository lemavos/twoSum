import java.util.Scanner;
import java.util.Arrays;

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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution s = new Solution();

        System.out.println("Enter numbers separated by spaces:");
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        int[] result = s.twoSum(nums, target);

        if (result != null) {
            System.out.println("Indexes found: " + result[0] + ", " + result[1]);
        } else {
            System.err.println("No combination found!");
        }

        scanner.close();
    }
}
