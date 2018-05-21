import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2D {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		int b[];
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		for (int i = 0; i < t; i++) {
			List<Integer> a = new ArrayList<Integer>();
			b = Arrays.asList(br.readLine().split(" ")).stream()
					.mapToInt(Integer::parseInt).toArray();
			for (int j = 1; j <=b[0]; j++)
				a.add(b[j]);
			arr.add(a);

		}
		//System.out.println(arr);
		int q = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < q; i++) {
			b = Arrays.asList(br.readLine().split(" ")).stream()
					.mapToInt(Integer::parseInt).toArray();
			b[0]-=1;
			b[1]-=1;
			if(b[1]<0||b[0]<0)
				System.out.println("ERROR!");
			else if(b[0]>(t-1))
				System.out.println("ERROR!");
			else if((arr.get(b[0]).size()-1)<b[1])
				System.out.println("ERROR!");
			else
			System.out.println( arr.get(b[0]).get(b[1]));
		}
	}

}
