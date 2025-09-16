class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        if(n==0)return 0;
        int large=1;
        for(int i:nums)
        set.add(i);
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int count=1;
                int x=num;
                while(set.contains(x+1))
                {
                    x=x+1;
                    count++;
                }
                large=Math.max(count,large);
            }
        }
        return large;
    }
}