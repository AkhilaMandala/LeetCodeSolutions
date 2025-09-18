class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(nums,0,ans);
        return ans;
    }
    public static void backtrack(int[] nums,int index,List<List<Integer>> ans)
    {
        if(index==nums.length)
        {
            List<Integer> permutation=new ArrayList<>();
            for(int i:nums)
            {
                permutation.add(i);
            }
            ans.add(new ArrayList<>(permutation));
            return;
        }
        for(int j=index;j<nums.length;j++)
        {
            swap(index,j,nums);
            backtrack(nums,index+1,ans);
            swap(index,j,nums);
        }
    }
    public static void swap(int index,int j,int[] nums)
    {
        int temp=nums[index];
        nums[index]=nums[j];
        nums[j]=temp;
    } 
}