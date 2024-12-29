class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList();

        for(int i = 0; i < rowIndex+1; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j < i+1; j++){
                if(j == 0 || j == i){
                    temp.add(1);
                }
                else {
                    temp.add(pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j));
                }
            }
            pascal.add(temp);
        }

        System.out.println(pascal);

        return pascal.get(rowIndex);
        
    }
}