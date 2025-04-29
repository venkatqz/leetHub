class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;

        digits[n-1]+=1;
        int i=n-1;
        if(n>1){
            for(;i>0;i--){

                if(digits[i]>9){
                    digits[i]=0;
                    digits[i-1]+=1;
                }
            }
        }
        if(i==0 && digits[i]>9){
            int b[]=new int[n+1];
            b[0]=1;
            b[1]=0;
            for(int j=2;j<n+1;j++){
                b[j]=digits[j-1];

            }
            return b;

            //add one number 0
            //perform right shift
            //insert at 0
        }


        return digits;

        

    }
}