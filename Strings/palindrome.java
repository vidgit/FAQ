import java.io.*;
import java.util.*;
public class palindrome {
    public static int isPalindrome(String a) {
        a=a.toUpperCase();
        ArrayList<Character> list=new ArrayList<Character>();
        int l =a.length();
        for(int i=0;i<l;i++){
            //System.out.println(a.charAt(i));
            if(isAN(a.charAt(i)))
               list.add(a.charAt(i)); 
        }
        //System.out.println(list);
        for(int i=0,j=list.size()-1;i<=j;i++,j--)
            {
                if(list.get(i)!=list.get(j))
                    return 0;
            }
       return 1;
    }
    
    public static boolean isAN(char c){
        if(c<='9'&&c>='0')
            return true;
        if(c<='Z'&&c>='A')
            return true;
        if(c<='z'&&c>='a')
            return true;
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s=br.readLine();
        System.out.println(isPalindrome(s));
    }
}