import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinimumValSubArray {

	static int a[];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		a = Arrays.asList(br.readLine().split(" ")).stream()
				.mapToInt(Integer::parseInt).toArray();
		int c = 0;
		//for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = a.length - 1; k >=j; k--)
					if (calcsum(j, k))
						c++;
			}
		
		System.out.println(c);
	}

	static boolean calcsum(int b, int e) {
		int sum = 0;
		//System.out.print("["+b+","+e+"] = ");
		for (; b <= e; b++)
			sum += a[b];
	//System.out.println(sum);
		if (sum < 0)
			return true;
		else
			return false;
	}

}
