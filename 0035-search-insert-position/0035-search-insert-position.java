class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=-1;
        int r=nums.length;
        while(l+1<r)
        {
         int m=(l+r)/2;
         if(isPredicate(m,nums,target)==0)l=m;
         else r=m;
        }
       return r;
    }
    public static int isPredicate(int m,int[] nums, int target)
    {
        if(nums[m]<target)return 0;
        else return 1;
    }
}