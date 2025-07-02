class Solution {
    public int removeElement(int[] nums, int val) {
        int l=nums.length-1;
        int i=0;


        while(i<=l){
            if(nums[i]==val){
                nums[i]=nums[l];
                l--;

            }else{
                i++;
            }
        }
        return l+1;
    }
}