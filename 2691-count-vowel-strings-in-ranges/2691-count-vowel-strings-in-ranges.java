class Solution {
        public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixSum = new int[n + 1];
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (isVowel(word.charAt(0), vowels) && isVowel(word.charAt(word.length() - 1), vowels)) {
                prefixSum[i + 1] = prefixSum[i] + 1;
            } else {
                prefixSum[i + 1] = prefixSum[i];
            }
        }

        int[] result = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            int start = queries[j][0];
            int end = queries[j][1];
            result[j] = prefixSum[end + 1] - prefixSum[start];
        }

        return result;
    }

    private boolean isVowel(char ch, Set<Character> vowels) {
        return vowels.contains(ch);
    }
}