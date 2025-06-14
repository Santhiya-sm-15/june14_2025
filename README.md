# june14_2025
The problem that i solved today in leetcode

1.You are given an integer num. You know that Bob will sneakily remap one of the 10 possible digits (0 to 9) to another digit.

Return the difference between the maximum and minimum values Bob can make by remapping exactly one digit in num.

Notes:

When Bob remaps a digit d1 to another digit d2, Bob replaces all occurrences of d1 in num with d2.
Bob can remap a digit to itself, in which case num does not change.
Bob can remap different digits for obtaining minimum and maximum values respectively.
The resulting number after remapping can contain leading zeroes.

Code:
class Solution {
    public int minMaxDifference(int num) {
        int x=num;
        int f1=0,f2=0;
        while(x>0)
        {
            int r=x%10;
            if(r!=9)
                f1=r;
            f2=r;
            x=x/10;
        }
        long max=0,min=0;
        x=num;
        long p=1;
        while(x>0)
        {
            int r=x%10;
            if(r==f1)
                max=9*p+max;
            else
                max=r*p+max;
            if(r==f2)
                min=0*p+min;
            else
                min=r*p+min;
            x/=10;
            p*=10;
        }
        return (int)(max-min);
    }
}
