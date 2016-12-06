def repeatedNumber(A):
        k=1
        i=2
        A=list(A)
        n=len(A)
        while(i<=n-1):
            k=k^i
            i+=1
        temp=A[0]
        for j in range(1,n):
            temp=temp^A[j]
        
        return temp^k

A=[1,1,3,4,5]
print repeatedNumber(A)