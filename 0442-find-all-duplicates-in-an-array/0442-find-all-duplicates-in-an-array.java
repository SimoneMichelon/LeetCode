class Solution {
     public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> lista = new ArrayList<>();
        
        for (int num : nums) {
        if (set.contains(num)) {
            lista.add(num);
        }
        set.add(num);
        }


        return lista;
    }
}