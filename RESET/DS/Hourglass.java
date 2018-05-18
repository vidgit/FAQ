
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hourglass {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = new String[6];
		int[][] a = new int[6][6];
		for (int i = 0; i < 6; i++) {
			s = br.readLine().split(" ");
			a[i] = Arrays.asList(s).stream().mapToInt(Integer::parseInt)
					.toArray();
		}
		int max = -90, sum = 0;
	
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum=0;
				sum += (a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] +a[i+2][j]
						+ a[i+2][j+1] + a[i+2][j+2]);
			
				if (sum > max)
					max = sum;

			}
		}
		System.out.println(max);
	}

}
