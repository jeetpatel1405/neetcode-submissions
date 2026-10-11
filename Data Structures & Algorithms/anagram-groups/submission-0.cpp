class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<string> temp;
        vector<vector<string>> ans ;
        map<string,int> mp;
        int in = 0;
        string s;
        for(int i=0;i<strs.size();i++)
        {
            s = strs[i];
            sort(strs[i].begin(),strs[i].end());
            if(mp.find(strs[i])==mp.end())
            {
                temp.push_back(s);
                mp[strs[i]]=in;
                in++;
                ans.push_back(temp);
                temp.clear();
            }
            else{
                ans[mp[strs[i]]].push_back(s);
            }
        }
        return ans;
    }
};
