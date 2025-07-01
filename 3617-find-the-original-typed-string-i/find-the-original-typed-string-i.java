class Solution {
    public int possibleStringCount(String word) {
        //string itself + repeating letters count -1 or letters repeated. so hashmap to check

        //1+
        int ans = 0;
        char prevChar = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == prevChar) {
                ans++;
            } else {
                prevChar = c;
            }
        }
        return ans + 1;
    }
}