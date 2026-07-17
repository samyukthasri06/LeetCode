// Last updated: 7/17/2026, 3:14:23 PM
class Solution 
{
    public int passThePillow(int n, int time)
     {
        int pos=1;
        int dir=1; 
        for(int i=0;i<time;i++)
         {
            pos+=dir;
            if(pos==n||pos==1) 
            {
                dir=-dir; 
            }
        }
        return pos;
    }
}