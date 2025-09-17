class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct=0;
        int product=1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
         product=product*nums[i];
         maxProduct=Math.max(maxProduct,product);
         if(product==0)
         product=1;
        }
        product=1;
        for(int i=n-1;i>=0;i--)
        {
            product*=nums[i];
            maxProduct=Math.max(maxProduct,product);
            if(product==0)
            product=1;
        }
        return maxProduct;
    }
}