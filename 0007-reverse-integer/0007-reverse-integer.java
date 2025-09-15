class Solution {
    public int reverse(int x)
    {
        int reversedNum=0;
        int temp=x;
        while(x!=0)
        {
         int remainder= x % 10;
         if((reversedNum>Integer.MAX_VALUE/10) || (reversedNum<Integer.MIN_VALUE/10)) return 0;
         reversedNum=reversedNum*10+remainder;
         x/=10;
        }
       return reversedNum;
        //return (temp<0)? -reversedNum:reversedNum;
       
    }
}