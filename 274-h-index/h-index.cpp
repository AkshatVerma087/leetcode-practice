class Solution {
public:
    int hIndex(vector<int>& citations) {
        if(citations.size() == 1 && citations[0] == 0) return 0;
        if(citations.size() == 1) return 1;
        sort(citations.begin(), citations.end());

        int ans = 0;
        for(int i = 0; i < citations.size(); i++){
            if(citations[i] >= citations.size() - i){
                ans++;
            }
        }

        return ans;
    }
};