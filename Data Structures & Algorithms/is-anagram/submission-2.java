class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp = new HashMap<>();

        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)-1);
        }
        for (Map.Entry<Character, Integer> entry : mp.entrySet())
        {
            if(entry.getValue()!=0) return false;
        }
        return true;
    }
}
