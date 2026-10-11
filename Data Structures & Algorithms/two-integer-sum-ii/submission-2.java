class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] arr = new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            int val = target-numbers[i];
            if(mp.containsKey(val)) {
                arr[1] = i+1;
                arr[0] = mp.get(val);
            }
            else mp.put(numbers[i],i+1);
        }
        return arr;

    }
}
