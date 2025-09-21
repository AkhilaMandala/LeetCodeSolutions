class Solution {
    // public int findPeakElement(int[] nums) {
    //     //here we must return the index value.....
    //     int n=nums.length;
    //     int L=-1;
    //     int R=n;
    //     if(n==1)return 0;
    //     while(L+1<R)
    //     {
    //         int mid=(L+R)/2;
    //         if(isPredicate(nums,mid)==0)L=mid;
    //         else R=mid;
    //     }
    //     return L;
    // }
    // public static int isPredicate(int[] nums,int mid)
    // {
    //    int n=nums.length;
    //     if (mid == 0) {
    //         return (nums[mid] > nums[mid + 1]) ? 0 : 1;
    //     }
    //     if (mid == n - 1) {
    //         return (nums[mid] > nums[mid - 1]) ? 0 : 1;
    //     }
    //     if (nums[mid] > nums[mid - 1]) return 0;
    //     else return 1;
    // }
    public static int findPeakElement(int[] nums) {
    int left = 0, right = nums.length - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] > nums[mid + 1]) {
            right = mid;       
        } else {
            left = mid + 1;    
        }
    }
    return left; 
}
}