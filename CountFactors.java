/*
Solution to Count Factors Task
Average Run Time of O(Sqrt(N))
*/

import java.lang.Math;

class Solution
{
    public int solution(int N)
    {
        int F = 0; //Count of Factors
        for (int i=1; i<Math.sqrt(N); i++) //Loop From One to Integer Before Square Root of Number
            F += (N%i==0) ? 2 : 0; //If Factor of Number, Increase Count By Two
            
        F += (N%Math.sqrt(N)==0) ? 1 : 0; //If Number is Perfect Square, Increase Count By One
        
        return F; //Return Count
    }
}