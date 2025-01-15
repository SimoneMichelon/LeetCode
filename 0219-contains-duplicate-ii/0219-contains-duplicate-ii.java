class Solution {

    public int abs (int n){
        return n < 0 ? n*-1 :n;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) && abs(map.get(nums[i]) - i) <= k ){
                return true;
            }
            map.put(new Integer(nums[i]),new Integer(i));
        }
        return false;
    }
}