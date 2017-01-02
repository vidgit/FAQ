/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class Factorial {
    ArrayList<Integer> fact=new ArrayList<Integer>();
    public int cFact(int x){
        if(x>=fact.size()){
            for(int i=fact.size();i<=x;i++){
                fact.add(fact.get(i-1)*i);
            }
        }
        return fact.get(x);
    }
    
    
    
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
         */
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int t = Integer.parseInt(line);
        Factorial o=new Factorial();
        o.fact.add(1);
        o.fact.add(1);
        while(t-->0){
            System.out.println(o.cFact(Integer.parseInt(br.readLine().trim())));
        }
        
    }
}
