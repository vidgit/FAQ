public class TripletSolve{
    static int[] solve(int[] a, int[] b) {
        System.out.println("----------------FIRST LINE OF SOLVE---------------------");
        
        int pa=0,pb=0;
        pa=(a[0]>b[0]?1:0)+(a[1]>b[1]?1:0)+(a[2]>b[2]?1:0);
        pb=(a[0]<b[0]?1:0)+(a[1]<b[1]?1:0)+(a[2]<b[2]?1:0);
        return new int[]{pa,pb};

    }

    public static void main(String[] args) {
        System.out.println("-----------FIRST LINE OF MAIN------------");
        
    }
}
