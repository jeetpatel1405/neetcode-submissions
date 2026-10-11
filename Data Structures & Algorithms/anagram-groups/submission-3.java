
class Solution {
    public String BitString(String s) {
        String ans = new String();
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            ans += String.valueOf(arr[i]) + '#';
        }

        return ans;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s = BitString(strs[i]);

            if (mp.containsKey(s)) {
                mp.get(s).add(strs[i]);
            } else {
                mp.put(s, new ArrayList<>(List.of(strs[i])));
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry : mp.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }
}
