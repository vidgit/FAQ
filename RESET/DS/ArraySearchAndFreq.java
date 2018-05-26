//Find the largest value in an array and how many times its repeated.
import java.io.*;

public class ArraySearchAndFreq{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String d = br.readLine();
        String[] s= br.readLine().split(" ");
        int max = 0;
        int freq=0;
        for(int i =0; i< s.length;i++){
            int curr = Integer.parseInt(s[i]);
            if(curr>max){
                max=curr;
                freq=1;
            }
            else if(curr == max){
                freq++;
            }
        }
        System.out.println(freq);
    }
}
