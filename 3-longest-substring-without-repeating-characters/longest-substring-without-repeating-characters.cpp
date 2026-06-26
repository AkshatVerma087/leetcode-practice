class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char,int> mp;
        int i = 0, j = 0;
        int n = s.length();
        int ans = INT_MIN;

        while(j < n){
            mp[s[j]]++;
            
            while(mp[s[j]] > 1 && i < j){
                mp[s[i]]--;
                i++;
            }

            ans = max(ans, j-i+1);
            j++;
        }

        return ans == INT_MIN ? 0 : ans;

    }
};