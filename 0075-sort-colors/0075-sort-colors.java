class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int num:nums){
        System.out.print(num + " ");
        }
    }
}