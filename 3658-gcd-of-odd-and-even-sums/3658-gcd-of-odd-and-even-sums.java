class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n * n;
        int sumEven = n*(n+1);
        int GCD = 1;


        while (sumEven > 0 && sumOdd > 0) {
            if (sumEven > sumOdd) {
                sumEven = sumEven % sumOdd;
            } else if (sumEven < sumOdd) {
                sumOdd = sumOdd % sumEven;
            }
        }
        if (sumEven == 0) {
            GCD = sumOdd;
        } else {
            GCD = sumEven;
        }
        return GCD;
    }
}