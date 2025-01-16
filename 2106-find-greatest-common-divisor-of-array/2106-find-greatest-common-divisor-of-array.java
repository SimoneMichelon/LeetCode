class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : nums){
            if(min > i){
                min = i;
            }
            if(max < i){
                max = i;
            }
        }
        int half = min / 2;

        if(min == max || max % min == 0 ){
            return min;
        } else if(half <= 1){
            return 1;
        }
        
        for(int i = half; i >=1; i--){
            if((min % i == 0) && (max % i == 0)){
                return i;
            }
        }

        return 0;
    }
}