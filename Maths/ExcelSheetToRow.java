public class ExcelSheetToRow {
    public static String convertToTitle(int a) {
        String s="";
        while(a>0){
            int x=(a)%26;
            if(x==0){
                x=26;
                a--;
            }
            //System.out.println((char)(x+64)+":"+x+":"+a);
            a=(a)/26;
            s=(char)(x+64)+s;
        }
        return s;
    }

    public static void main(String[] args) {
        for(int i=1;i<30;i++)
        System.out.println(i+":"+convertToTitle(i));
    }
}
