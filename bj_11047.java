import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_11047 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer input = new StringTokenizer(br.readLine(), " ");
		
		int cnt = Integer.parseInt(input.nextToken());
		int val = Integer.parseInt(input.nextToken());
		
		int[] coin = new int[cnt];

    for(int i = 0; i < cnt; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;

		for (int i = cnt - 1; i >= 0; i--) {
			if (coin[i] <= val) {
				count += (val / coin[i]);
				val = val % coin[i];
			}
		}

		System.out.println(count);
  }
}

