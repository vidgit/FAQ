public class FirstandLast{
    public static int first(int[] a,int n){
        int l=a.length;
        int i=0,j=l-1;
        while(i<j){
            int mid=(i+j)/2;
            int ix=a[mid];
            if((ix==n&&mid==i)||(ix==n&&a[mid-1]<n))
                return mid;
            if(a[mid]<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        if(a[i]!=n)
            return -1;
        return i;
    }

    public static int last(int[] a,int n){
        int l=a.length;
        int i=0,j=l-1;
        while(i<j){
            int mid=(i+j)/2;
            int ix=a[mid];
            if((ix==n&&mid==i)||(ix==n&&a[mid+1]>n))
                return mid;
            if(a[mid]<=n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        if(a[i]!=n)
            return -1;
        return i;
    }

    public static void main(String[] args) {
        int[] a={1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        System.out.println(first(a,10));
        System.out.println(last(a,10));
        System.out.println(last(a,10)-first(a,10)+1);
    }
}