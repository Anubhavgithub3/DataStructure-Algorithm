class Solution {
    public int reverse(int x) {
        
        int reverse = 0;
        int n = Math.abs(x);
        while (n > 0) {
            int digit = n % 10;  
            if(reverse > Integer.MAX_VALUE / 10){
                return 0;
            }    
            reverse = reverse * 10 + digit;
            n = n / 10;              
        }
        if(x < 0){
            return -1*reverse;
        }else{
            return reverse;
        }
        
      
    }
}