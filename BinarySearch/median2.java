public class median2{
    public double getMedian(ArrayList<Integer> a,int start,int end){
        int half=(start+end)/2;
        if((start+end)%2==0)
        {
            
            return (a.get(half)+a.get(half-1)/2.0;
        }
        return a.get(half);
    }
}