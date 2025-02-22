class Solution {
    public boolean canConstruct(String s, int k) {
        int[] freq=new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2!=0){
                count++;
            }
        }
        if(s.length()<k){
            return false;
        }
        return count<=k?true:false;

    }
}