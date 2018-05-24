public class TripletSolve{
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static int[] solve(int[] a, int[] b) {
        System.out.println("----------------FIRST LINE OF SOLVE---------------------");
        
        int pa=0,pb=0;
        pa=(a[0]>b[0]?1:0)+(a[1]>b[1]?1:0)+(a[2]>b[2]?1:0);
        pb=(a[0]<b[0]?1:0)+(a[1]<b[1]?1:0)+(a[2]<b[2]?1:0);
        return new int[]{pa,pb};

    }

    public static int[] readArray()throws IOException{
        int[] arr;
        String[] srr = br.readLine().trim().split(" ");
        arr =  new int[srr.length];
        for(int i = 0; i<srr.length;i++){
            arr[i]=Integer.parseInt(srr[i]);
        }
        return arr;
    }

    public static void main(String[] args)throws IOException {
        System.out.println("-----------FIRST LINE OF MAIN------------");
        int[] alice = readArray();
        int[] bob = readArray();
        int[] result = solve(alice,bob);
        System.out.printf("Alice :%d Bob:%d",result[0],result[1]);
    }
}
