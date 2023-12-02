import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Map.Entry;

public class bj_1969 {
  static int N;
  static int M;
  static int sum;
  static StringBuilder result = null;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    String[] newDNA = new String[N];

    for (int i = 0; i < N; i++) {
      newDNA[i] = br.readLine();
    }

    solution(newDNA);
    
    System.out.println(result.toString());
    System.out.println(sum);
    br.close();
  }

  private static void solution(String[] inputs) {
    char ch = ' '; // 문자
		int max; // 최대값

    sum = 0;
    result = new StringBuilder();

		for (int i = 0; i < M; i++) {
			HashMap<Character, Integer> map = new HashMap<>();
			max = 0;

			for (int j = 0; j < N; j++) {	
				String str = inputs[j];

				map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
			}
			
			Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();

			while (it.hasNext()) {
				Entry<Character, Integer> entrySet = (Entry<Character, Integer>)it.next();
				int value = entrySet.getValue();
				char key =  entrySet.getKey();

				if ( max < value ) {
					max = value;
					ch = key;
          continue;
				}
				
        if (max == value) {
					char temp = key;

					int num1 = Character.getNumericValue(ch);
					int num2 = Character.getNumericValue(temp);

					if (num1 > num2) {
						ch = temp;
					}
				}
			}

			sum += N - max;
			result.append(ch);
		}
  }
}