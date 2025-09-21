class Solution {
    public int findMin(int[] nums) {
      int n=nums.length;
      int L=-1;
      int R=n;
      while(L+1<R)
      {
        int mid=(L+R)/2;
        if(isPredicate(mid,nums)==0)L=mid;
        else R=mid;
      }
      return nums[R];
    }
    public static int isPredicate(int mid,int[] nums)
    {
        if(nums[mid]>nums[nums.length-1])return 0;
        else return 1;
    }
}