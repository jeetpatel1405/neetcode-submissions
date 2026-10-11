class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,List<String>> mp = new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            List<String> temp = new ArrayList<>();
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sortedstr = Arrays.toString(ch);
            if(mp.containsKey(sortedstr))
            {
                temp = mp.get(sortedstr);
                temp.add(strs[i]);
                mp.put(sortedstr,temp);
            }
            else{
                temp.add(strs[i]);
                mp.put(sortedstr,temp);
            }
           
        }
        for (Map.Entry<String, List<String>> entry : mp.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
        
        
    }
}
