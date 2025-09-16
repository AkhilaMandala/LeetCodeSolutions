class Solution {
    public void nextPermutation(int[] nums) {
      int pivot=-1;
      int n=nums.length;
      for(int i=n-2;i>=0;i--)
      {
       if(nums[i]<nums[i+1])
       {pivot=i;
       break;}
      }  
      if(pivot==-1)
      {
        reverse(nums,0,n-1);
        return;
      }
      for(int k=n-1;k>pivot;k--)
      {
        if(nums[pivot]<nums[k])
        {
            int tem=nums[pivot];
            nums[pivot]=nums[k];
            nums[k]=tem;
            break;
        }
      }
      reverse(nums,pivot+1,n-1);

    }
    public static void reverse(int[] nums,int start,int end)
    {
        while(start<end){
          int temp=nums[start];
          nums[start]=nums[end];
          nums[end]=temp;
          start++;
          end--;
        }
    }
}