class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i =0; i < n; i++){
            if (nums[i] == 0){
                count++;
            }
        }
        int[] temp = new int[(n - count)];

        int j =0;
        for (int i = 0; i < n;i++){
            if( nums[i] != 0){
                temp[j] = nums[i];
                j++;
            }
        }
        for(int i = 0; i < n-count; i++){
            nums[i] = temp[i];
        }
        for(int i = n-count;i<n;i++){
            nums[i] = 0;
        }
    }
}