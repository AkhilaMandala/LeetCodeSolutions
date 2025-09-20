////*******  BRUTE FORCE      ************/
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n=nums.length;
//         if(n<=0)return 0;
//         int count=0;
//         for(int i=0;i<n;i++)
//         {
//           int sum=0;
//           for(int j=i;j<n;j++)
//           {
//            sum=sum+a[j];
//            if(sum==k)count++;
//           }
//         }
//         return count;
//     }
// }

class Solution{
    public int subarraySum(int[] nums,int k)
    {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0, count=0;
        for(int num:nums)
        {
            sum=sum+num;
            if(map.containsKey(sum-k))
            {
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}