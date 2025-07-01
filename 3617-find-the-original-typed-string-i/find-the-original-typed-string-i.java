class Solution {
    public int possibleStringCount(String word) {
        //string itself + repeating letters count -1 or letters repeated. so hashmap to check

        //1+
        int possible=1; 
        HashMap<Character,Boolean> charoccur=new HashMap<Character,Boolean>();

        charoccur.put(word.charAt(0),true);
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1) && charoccur.containsKey(word.charAt(i))){
                possible++;
            }
            else{charoccur.put(word.charAt(i),true);}


        }
        return possible;
    }
}