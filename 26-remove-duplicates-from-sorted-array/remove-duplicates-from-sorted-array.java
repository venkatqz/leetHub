class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==1){return 1;}
        int j=0,temp;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[j] ){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1
        ;
        
    }
}