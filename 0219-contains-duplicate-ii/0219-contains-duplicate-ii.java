class Solution {

    public int abs (int n){
        return n < 0 ? n*-1 :n;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) ){

                System.out.println(abs(map.get(nums[i]) - i) + " <= " + k);
                if(abs(map.get(nums[i]) - i) <= k ){
                    return true;
                }
            }
            map.put(new Integer(nums[i]),new Integer(i));
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }

        return false;
    }
}