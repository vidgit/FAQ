import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Weird {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public boolean isWeird(int n){
        if(n%2==1)
            return true;
        if(n>=2&&n<=5)
            return false;
        if(n>=6&&n<=20)
            return true;
        return false;
    }

    public int readInt()throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }

    public static void main(String args[])throws IOException{
        introduction.Weird w = new introduction.Weird();
        if(w.isWeird(w.readInt()))
            System.out.println("Weird");
        else
            System.out.println("Not Weird");
    }
}
