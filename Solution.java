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