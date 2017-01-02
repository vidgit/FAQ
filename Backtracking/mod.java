public class mod {
    public static int Mod(int a, int b, int c) {
        if(b==0)
            return 1%c;
        long x=0;
        if(b%2==0){
            x= Mod(a,b/2,c);
            x= (x*x)%c;
        }
        else{
            x= a%c;
            x= (x* Mod(a,b-1,c))%c;
        }
        return (int)(x+c)%c;
    }
    public static void main(String[] args) {
        System.out.println(Mod(71045970,41535484,64735492));
    }
}