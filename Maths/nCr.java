public class nCr{
    public static void main(String[] args) {
        int n=5;
        int num=1;
        for(int i=0;i<=n;i++){
            System.out.print(num+" ");
           // System.out.println((n-i)/(i+1)+" ");
            num=num*(n-i)/(i+1);
        }
    }
}