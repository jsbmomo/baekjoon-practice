import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1149 {
	static BufferedReader br;
	static int[][] house;
	static int count;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		count = Integer.parseInt(br.readLine());
		
		generateDataSet();

		int cost1 = findMinimumValues(0);
		int cost2 = findMinimumValues(1);
		int cost3 = findMinimumValues(2);

		System.out.println(cost1+cost2+cost3);

		br.close();
	}

	static void generateDataSet() throws IOException {
		StringTokenizer st = null;

		house = new int[count][3];

		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine());
			house[i][0] = Integer.parseInt(st.nextToken());
			house[i][1] = Integer.parseInt(st.nextToken());
			house[i][2] = Integer.parseInt(st.nextToken());
		}
	}

	static int findMinimumValues(int startIndex) {
		int sum = house[0][startIndex];
		int deforeIndex = startIndex;

		for (int i = 1; i < count; i++) {
			if (deforeIndex == 0) {
				deforeIndex = house[i][1] < house[i][2] ? 1 : 2;
				sum += house[i][deforeIndex];
				continue;
			}

			if (deforeIndex == 1) {
				deforeIndex = house[i][0] < house[i][2] ? 0 : 2;
				sum += house[i][deforeIndex];
				continue;
			}

			if (deforeIndex == 2) {
				deforeIndex = house[i][0] < house[i][1] ? 0 : 1;
				sum += house[i][deforeIndex];
			}
		}

		return sum;
	}
}