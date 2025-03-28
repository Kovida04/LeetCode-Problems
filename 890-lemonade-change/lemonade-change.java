class Solution {
    public boolean lemonadeChange(int[] bills) {
       int fx=0, ty=0;
       for (int n:bills){
        if(n==5) fx++;
        else if(n==10) {
            if(fx<1) return false;
            fx--; ty++;
        }
        else {
            if(fx>=1 && ty>=1 ) {fx--;ty--;}
            else if (fx>=3) fx=fx-3;
            else return false;
        }

       }
       return true; 
    }
}