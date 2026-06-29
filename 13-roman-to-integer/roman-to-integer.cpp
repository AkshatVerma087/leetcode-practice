class Solution {
public:
    int romanToInt(string s) {
    unordered_map<char, int> mp = {
        {'I', 1},
        {'V', 5},
        {'X', 10},
        {'L', 50},
        {'C', 100},
        {'D', 500},
        {'M', 1000}
    };

        int ans = 0;
        int last = 0;

        for(int i = s.length()-1; i >= 0; i--){
            char ch = s[i];
            cout<<mp[ch]<<" "<<last<<endl;
            if(mp[ch] >= last){
                ans += mp[ch];
            }else{
                ans -= mp[ch];
            }
            last = mp[ch];
        }
        return ans;
    }
};