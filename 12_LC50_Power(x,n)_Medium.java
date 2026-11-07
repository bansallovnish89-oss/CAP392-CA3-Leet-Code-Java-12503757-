class Solution {
    public double myPow(double x, int n) {
        long exponent = n; // Use long to safely handle Integer.MIN_VALUE

        if (exponent < 0) {
            x = 1.0 / x;
            exponent = -exponent;
        }

        double result = 1.0;

        // Exponentiation by squaring: O(log |n|)
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result *= x;
            }
            x *= x;
            exponent >>= 1;
        }

        return result;
    }
}
