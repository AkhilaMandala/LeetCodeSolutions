/*******            KADANE's Algorithm      ********/

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0,maxi=0;
        map.put(0,-1);
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
         sum+=(nums[i]==1? 1:-1);
         if(map.containsKey(sum))
         {
            maxi=Math.max(maxi,i-map.get(sum));
         }
         else
         {
            map.put(sum,i);
         }
        }
        return maxi;
    }
}