public class Power{
    public static int pow(int a,int p)
    {
        if(p==0)
            return 1;
        int temp=pow(a,p/2);
        if(p%2==0){
            return temp*temp;
        }
        else 
            return temp*temp*a;
    }

    public static int pow2(int a,int p){
        if(p==0)
            return 1;
        long ans=1,base=a;
        while(p>0){

            if(p%2==0){
                System.out.println(1);        
                base=base*base;
                p/=2;
            }
            else{
                System.out.println(2);
                ans=base*ans;
                p--;
            }
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        System.out.println(pow2(2,4));
    }
}