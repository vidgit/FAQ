public class FirstandLast{
    public static int first(int[] a,int n){
        int l=a.length;
        int i=0,j=l-1;
        while(i<j){
            int mid=(i+j)/2;
            if(a[mid]<n){
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        return i;
    }

    public static int last(int[] a,int n){
        int l=a.length;
        int i=0,j=l-1;
        while(i<j){
            int mid=(i+j)/2;
            if(a[mid]>n){
                j=mid-1;
            }
            else{
                i=mid;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] a={1,2,2,2,3,4,5};
        System.out.println(first(a,2));
        System.out.println(last(a,2));
        System.out.println(last(a,2)-first(a,2)+1);
    }
}