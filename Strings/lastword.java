public class lastword {
    public static int lengthOfLastWord(final String a) {
        
        int l=a.length();
        int i=1;
        while(l-i>=0&&a.charAt(l-i)==' ')
            i++;
        int offset=i;
        //System.out.println(offset);
        for(;i<=l;i++){
            char c = a.charAt(l-i);
            //System.out.println(c);
            if(!isAlpha(c)){
                System.out.println(i);
                return (i-offset);
            }
        }
        if(i>l)
            return (i-offset);
        return l;   
    }
    
    public static boolean isAlpha(char c){
        if(c<='Z'&&c>='A')
            return true;
        if(c<='z'&&c>='a')
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("wordl   "));
    }
}