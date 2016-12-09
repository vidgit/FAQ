public class ExcelSheetCol {
    public static int titleToNumber(String a) {
        int l=a.length()-1;
        int factor=1,val=0;
        while(l>=0){
            val+=(factor*(a.charAt(l--)-64));
            factor*=26;
        }
        return val;
    }
    public static void main(String[] args) {
        System.out.println(titleToNumber("BAQTZ"));
    }
}