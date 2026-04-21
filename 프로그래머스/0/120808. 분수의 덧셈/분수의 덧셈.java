class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] num3 = {(denom2*numer1) + (denom1*numer2), denom1*denom2};
        int gcd;
        int a=(denom2*numer1) + (denom1*numer2);
        int b= denom1*denom2;
        while(b!=0){int r = a%b;
                a=b;
                b=r;}
        gcd =a;
        int[] result = {((denom2*numer1) + (denom1*numer2)) /gcd, denom1*denom2/gcd};
        return result;
    }
}