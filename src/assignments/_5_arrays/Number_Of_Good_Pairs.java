package assignments._5_arrays;

public class Number_Of_Good_Pairs {
    public static void main(String[] args) {

        int[] nums = {1,1,1,1};

        int res = numIdenticalPairs(nums);
        System.out.println(res);

    }

    public static int numIdenticalPairs(int[] nums) {

            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count = count + 1;
                    }
                }
            }

            return count;
    }

}
