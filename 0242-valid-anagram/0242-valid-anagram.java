class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Integer> asciiS = new ArrayList<Integer>();
        ArrayList<Integer> asciiT = new ArrayList<Integer>();


        int sLength = s.length();
        int tLength = t.length();

        if(sLength != tLength){
            return false;
        }
        
        for(int i = 0; i < sLength; i++){
            asciiS.add((int) s.charAt(i));
            asciiT.add((int) t.charAt(i));
        }

        asciiS.sort(Comparator.naturalOrder());
        asciiT.sort(Comparator.naturalOrder());



        for(int i = 0; i < sLength; i++){
          if(asciiS.get(i)  != asciiT.get(i)){
            return false;
          }
        }

        return true;
        
    }
}