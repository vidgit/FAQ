/*
Largest Coprime Divisor

You are given two positive numbers A and B. You need to find the maximum valued integer X such that:

    X divides A i.e. A % X = 0
    X and B are co-prime i.e. gcd(X, B) = 1

For example,

A = 30
B = 12
We return
X = 5


 */
public class CoprimeFactor{
    public static int gcd(int a, int b) {
        if(a>b){
            int x=a;
            a=b;
            b=x;
        }
        
        while(a!=0){
            int temp=b%a;
            b=a;
            a=temp;
        }
        return b;
    }
    public int cpFact(int A, int B) {
        int g=gcd(A,B);
        while(g!=1){
            A/=g;
            g=gcd(A,B);
        }
        return A;
    }
}