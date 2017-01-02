public class divide{
public int divide(int dividend, int divisor) {
        if(divisor==0)
            return Integer.MAX_VALUE;
        //if((divisor==-1)&&(dividend==Integer.MAX_VALUE))
        //    return Integer.MIN_VALUE;
        if((divisor==-1)&&(dividend==Integer.MIN_VALUE))
            return Integer.MAX_VALUE;
        int result=0; 
        
        long pDividend= Math.abs((long)dividend);
        long pDivisor= Math.abs((long)divisor);
        
        while(pDividend>=pDivisor){
            int numShift=0;
            while(pDividend>=(pDivisor<<numShift))
                numShift++;
            numShift--;
            result+=1<<numShift;
            pDividend-=pDivisor<<numShift;
            
        }
        
        if((divisor<0&&dividend<0)||(divisor>0&&dividend>0))
            return result;
        else
            return -result;
    }

    }