public class Quick{
    public void quicksort(int[] a, int start,int end){
        if(start<end){
            int pIndex=partition(a,start,end);
            quicksort(a,start,pIndex-1);
            quicksort(a,pIndex+1,end);
        }
    }

    public int partition(int[] a,int start,int end){
        int pivot=a[end];
        int pIndex=start;
        for(int i=start;i<end;i++){
            if(a[i]<pivot){
                int temp=a[pIndex];
                a[pIndex]=a[i];
                a[i]=temp;
                pIndex++;
            }
        }
        int temp=a[pIndex];
        a[pIndex]=a[end];
        a[end]=temp;
        return pIndex;
    }

    public static void main(String[] args) {
        int[] a={7,8,5,6,1,33,45,2,45};
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        new Quick().quicksort(a,0,a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}