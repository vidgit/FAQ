public class A2I{
    static int atoi(String str)
    {   
        int i=-1;
        try{
            i=Integer.parseInt(str);
        }
        catch(NumberFormatException e){
            i=-1;
        }
        finally{
            return i;
        }
    }
    public static void main(String[] args) {
        System.out.println(atoi("12a"));
    }
}