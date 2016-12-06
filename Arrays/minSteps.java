import java.util.*;
import java.io.*;

public class minSteps{
      public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y){
        int currX,currY;
        int nextX,nextY;
        int steps=0;
        int xdiff;
        int ydiff;
        int i=0;
        while(i<X.size()-1){
            
            currX=X.get(i);
            currY=Y.get(i);
            nextX=X.get(i+1);
            nextY=Y.get(i+1);
            xdiff = nextX-currX;
            ydiff = nextY-currY;
            steps+=Math.abs(Math.abs(xdiff)>Math.abs(ydiff)?xdiff:ydiff);
            System.out.println(Math.abs(xdiff)>Math.abs(ydiff)?xdiff:ydiff);
            System.out.println("Steps: "+steps);
            i++;
        }
        return steps;
    }
    public static void main(String[] args)throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] xs = br.readLine().split(" ");
        String[] ys = br.readLine().split(" ");
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i=0;i<xs.length;i++){
            x.add(Integer.parseInt(xs[i]));
            y.add(Integer.parseInt(ys[i]));
        }
        System.out.println(new minSteps().coverPoints(x,y));

    }
}