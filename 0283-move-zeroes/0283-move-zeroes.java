class Solution {
    public void moveZeroes(int[] nums) {
        // --- optimalwa code
        int n = nums.length;
        int j = -1;
        for(int i = 0 ; i < n;i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1){
            return;
        }
        for(int i = j+1;i < n;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        
        
        
        // ------Brute force
        // int n = nums.length;
        // int count = 0;
        // for(int i =0; i < n; i++){
        //     if (nums[i] == 0){
        //         count++;
        //     }
        // }
        // int[] temp = new int[(n - count)];

        // int j =0;
        // for (int i = 0; i < n;i++){
        //     if( nums[i] != 0){
        //         temp[j] = nums[i];
        //         j++;
        //     }
        // }
        // for(int i = 0; i < n-count; i++){
        //     nums[i] = temp[i];
        // }
        // for(int i = n-count;i<n;i++){
        //     nums[i] = 0;
        // }
    }
}