class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        int ans = 0;
        int i = 0, j = 0;

        while (j < s.length()) {
            char ch = s.charAt(j);

            mp.put(ch, mp.getOrDefault(ch, 0) + 1);

            while (mp.get(ch) > 2) {
                char leftChar = s.charAt(i);

                mp.put(leftChar, mp.get(leftChar) - 1);

                i++;
            }

            ans = Math.max(ans, j - i + 1);

            j++;   
        }

        return ans;
    }
}