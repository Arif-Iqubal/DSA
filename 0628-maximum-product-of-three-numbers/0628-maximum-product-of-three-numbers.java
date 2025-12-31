class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int product1= nums[0]*nums[1]*nums[length-1];
        int product2= nums[length-1] * nums[length-2] * nums[length-3];
        if(product1>product2){
            return product1;
        }
        
        return product2;
    }
}