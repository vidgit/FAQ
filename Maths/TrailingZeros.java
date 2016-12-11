public class TrailingZeroes {
    public static int trailingZeroes(int a) {
        int count =0;
        int i=5;
        while(a/i>=1){
            count+=(a/i);
            i*=5;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(120));
    }
}
