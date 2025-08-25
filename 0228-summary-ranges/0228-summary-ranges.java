class Solution {
    public List<String> summaryRanges(int[] nums) {


        ArrayList<String> array = new ArrayList<String>();
        
        if( nums.length == 0){
            return array;
        }
        else if( nums.length == 1){
            array.add(nums[0]+"");
            return array;
        }

        String tmp = "";
        int num_start = nums[0];
        int num_prev = -275;

        for(int num : nums){
            if(num != num_start){
                if(num != num_prev+1 ){
                    if(num_start == num_prev){
                        tmp = num_start+"";
                    }
                    else{
                        tmp = num_start + "->" + num_prev;
                    }

                    array.add(tmp);
                    tmp = "";
                    num_start = num;
                }

            }
            else {
                System.out.println("Primo Giro");
            }
 
            num_prev = num;
            System.out.println(""+num_start+"  "+num_prev);
        }

        if(num_start == num_prev){
            tmp = num_start+"";
        }
        else{
            tmp = num_start + "->" + num_prev;
        }

        array.add(tmp);
    
        return array;
    }
}