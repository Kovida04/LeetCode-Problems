class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hs = new HashSet<>();
        
        while (!hs.contains(n)) {
            hs.add(n);
            n = getNxtNo(n);
            if (n == 1) {
                return true;
            }
        }
        
        return false;
    }

    private int getNxtNo(int n) {
        int output = 0;
        
        while (n > 0) {
            int digit = n % 10;
            output += digit * digit;
            n = n / 10;
        }
        
        return output;
    }
}