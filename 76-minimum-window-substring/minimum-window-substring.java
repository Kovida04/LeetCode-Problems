class Solution {
    public String minWindow(String s, String t) {
        int[] freq=new int[58];

        for(char ch:t.toCharArray()){
            freq[ch-'A']++;
        }
        
        int left=0,right=0,start=-1,minWindow=Integer.MAX_VALUE;
        int req=t.length();

        while(right<s.length()){
            if(freq[s.charAt(right)-'A']>0){
                req--;
            }
            freq[s.charAt(right)-'A']--;

            while(req==0){
                if(right-left+1<minWindow){
                    minWindow=right-left+1;
                    start=left;
                }
                freq[s.charAt(left)-'A']++;
                if(freq[s.charAt(left)-'A']>0){
                    req++;
                }
                left++;
            }

            right++;
        } 

        if(start==-1){
            return "";
        }
        return s.substring(start,start+minWindow);
    }
}