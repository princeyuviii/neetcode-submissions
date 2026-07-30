class Solution {
    int st = 0;
    int ml = 0;

    public String longestPalindrome(String s) {

        if(s.length() < 2){
            return s;
        }

        for(int i=0; i <s.length() ; i++){
            ex(s,i,i);
            ex(s,i,i+1);
        }

        return s.substring(st, st+ml);
        
    }

    private void ex(String s, int l, int r){
        while((l>=0 && r<s.length()) && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        int length = r-l-1;

        if(length > ml){
            ml = length;
            st = l+1;
        }
        
    }
}
