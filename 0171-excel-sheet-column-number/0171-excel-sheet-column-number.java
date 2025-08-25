class Solution {
    public int titleToNumber(String columnTitle) {

        Map<Character,Integer> alf = new HashMap<Character, Integer>();

        int n_letters = columnTitle.length()-1;

        for(int i = 65, j = 0; i < 91; i++, j++){
            alf.put(Character.valueOf((char)i), Integer.valueOf(j+1));
        }

        int sum = 0;

        for(int i = columnTitle.length()-1, p=0; i >= 0; i--,p++){
            sum += Math.pow(26,p) * alf.get(columnTitle.charAt(i));
        }

        return sum;
    }
}