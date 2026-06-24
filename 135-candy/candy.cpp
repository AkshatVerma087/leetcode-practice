class Solution {
public:
    int candy(vector<int>& ratings) {
        int ans = 0;
        int prevCandy = 1;
        int prevRating = ratings[0];
        vector<int> candies(ratings.size(), 1);
        for(int i = 1; i < ratings.size(); i++){
            if(ratings[i] > prevRating){
                candies[i] = prevCandy+1;
            
            }

            prevCandy = candies[i];
            prevRating = ratings[i];
        }

        prevRating = ratings.back();
        prevCandy = candies.back();
        for(int i = candies.size() - 2; i >= 0; i--){
            if(ratings[i] > prevRating){
               candies[i] = max(candies[i], prevCandy + 1);
            }

            prevCandy = candies[i];
            prevRating = ratings[i];

        }

        for(int num : candies){
            cout<<num<<" ";
            ans += num;
        }
        return ans;
    }
};