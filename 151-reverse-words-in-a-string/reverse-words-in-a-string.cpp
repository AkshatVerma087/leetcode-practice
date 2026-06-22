class Solution {
public:
    string reverseWords(string s) {
        int i = 0;
        vector<string> ans;

        int n = s.length();

        while(i < n){
            if(i < n && s[i] == ' ') i++;
            
            string temp;
            while(i < n && s[i] != ' '){
                temp.push_back(s[i]);
                i++;
            }

            if(temp.size() != 0) ans.push_back(temp);
        }

        reverse(ans.begin(), ans.end());
        string res = "";

        for(string ss : ans){
            res += ss;
            res += " ";
        }
        res.pop_back();
        

        return res;

    }
};