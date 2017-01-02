public class Rank {
    public long fact(int n){
        long f=1;
        for(int i=2;i<=n;i++){
            f*=i;
        }
        return f;
    }
    
    public int findRight(String s,int low,int hi){
        char c=s.charAt(low);
        int count=0;
        for(int i=low+1;i<=hi;i++){
            if(c>s.charAt(i))
                count++;
        }
        return count;
    }
    public int findRank(String a) {
        int l=a.length();
        long f=fact(l); 
        long rank=0;
        for(int i=0;i<l;i++){
            f/=(l-i);
            int num=findRight(a,i,l-1);
            System.out.println("Fact="+f+"* num ="+num);
            rank=(rank+(num*f))%100003;
        }
        return (int)((rank+1)%100003);
    }

    public static void main(String[] args) {
        System.out.println(new Rank().findRank("DTNGJPURFHYEW"));
    }
}