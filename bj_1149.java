import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1149 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int count = Integer.parseInt(br.readLine());
		
		int[][] house = new int[count + 1][3];

		for (int i = 1; i <= count; i++) {
			st = new StringTokenizer(br.readLine());

			int red = Integer.parseInt(st.nextToken());
			int blue = Integer.parseInt(st.nextToken());
			int green = Integer.parseInt(st.nextToken());

			house[i][0] = Math.min(house[i - 1][1], house[i - 1][2]) + red;
			house[i][1] = Math.min(house[i - 1][0], house[i - 1][2]) + blue;
			house[i][2] = Math.min(house[i - 1][0], house[i - 1][1]) + green;
		}

		System.out.println(Math.min(house[count][0], Math.min(house[count][1], house[count][2])));
		br.close();
	}
}