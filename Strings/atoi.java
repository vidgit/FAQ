import java.util.*;
public class atoi{
    public static String clean(String a){
        StringBuffer sb=new StringBuffer();
        int i=0;
        //a=a.trim();
        int l=a.length();
        //if a is all space
        while(i<l&&a.charAt(i)==' '){
            i++;
        }
        //if a is just - then garbage or just -
        if(i<l&&(a.charAt(i)=='-'||a.charAt(i)=='+')){
            if(i+1<l)
                if(a.charAt(i+1)<='9'&&a.charAt(i+1)>='0'){
                    sb.append(a.charAt(i));
                    i++;
                }
                else
                    return sb.toString();
            else
                return sb.toString();
        }
        while(i<l&&a.charAt(i)<='9'&&a.charAt(i)>='0')
        {
            sb.append(a.charAt(i));
            i++;
        }
        return sb.toString();
    }

    public static int atoi(final String a) {
        String s=clean(a);
        if(s.length()==0){
            return 0;
        }
        
        long ans=0;
        boolean sign=true;
        int i=0;
        if(s.charAt(i)=='-'){
            sign=false;
            i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length())
            {
                System.out.println(s.charAt(i));
                ans=ans*10+(s.charAt(i)-'0');
                System.out.println(ans);
                i++;
            }
        if(!sign){
            ans*=-1;
        }
        if(ans>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if(ans<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else
            return (int)ans;
        
    }

    public static void main(String[] args) {
        /*String s=clean("asdsaff");
        System.out.println(s.length());
        System.out.println(s);
         s=clean("-asdsaff");
        System.out.println(s.length());
        System.out.println(s);
         s=clean("123asdsaff");
        System.out.println(s.length());
        System.out.println(s);
         s=clean("-123asdsaff");
        System.out.println(s.length());
        System.out.println(s);
         s=clean("        -123asdsaff");
        System.out.println(s.length());
        System.out.println(s);
        */
        String s=" -7";
        System.out.println(clean(s));
        System.out.println(atoi(s));
    }
}