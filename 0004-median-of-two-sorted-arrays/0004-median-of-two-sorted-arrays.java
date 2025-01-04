import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            arr.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            arr.add(nums2[i]);
        }
        arr.sort(Comparator.naturalOrder());

        if(arr.size() % 2 != 0){
            return arr.get(arr.size()/2);
        }
        
        double a = arr.get((arr.size()/2)-1);
        double b = arr.get((arr.size()/2));

        System.out.println(a + " " + b);

        return (a+b)/2;
    }
}