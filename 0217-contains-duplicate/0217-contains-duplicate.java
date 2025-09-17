class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> single=new HashSet<>();
       Set<Integer> duplicate=new HashSet<>();
       for(int i:nums)
       {
        if(!single.add(i))
        {
            duplicate.add(i);
        }
       } 
       if(duplicate.isEmpty())return false;
       else return true;
    }
}