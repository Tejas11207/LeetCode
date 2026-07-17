class Solution {
    public int reverse(int x) {

        int revnum = 0;
        while (x != 0) {

            int dig = x % 10;
            // Overflow check
            if (revnum > Integer.MAX_VALUE / 10 ||
                    (revnum == Integer.MAX_VALUE / 10 && dig > 7)) {
                return 0;
            }

            // Underflow check
            if (revnum < Integer.MIN_VALUE / 10 ||
                    (revnum == Integer.MIN_VALUE / 10 && dig < -8)) {
                return 0;
            }

            revnum = (revnum * 10) + dig;
            x = x / 10;
        }
        return revnum;

    }
}