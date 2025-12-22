class Solution {
    public int smallestEvenMultiple(int n) {
        int i=1;
        while(i<=2*n)
        {
            if(i%2==0 && i%n==0){
                return i;
            }
            i++;
        }
        return 0;
    }
}