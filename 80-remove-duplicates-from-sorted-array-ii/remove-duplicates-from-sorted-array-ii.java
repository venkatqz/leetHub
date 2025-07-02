class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=2;
        int n=nums.length;
        if(n<3) return n;
        for(int i=2;i<n;i++){
            if(nums[i]!=nums[idx-2]){
                nums[idx]=nums[i];
                idx++;

            }
        }
        return idx;

    }
}