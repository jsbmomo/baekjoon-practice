import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class bj_1764 {
  
  static int N, M;
  static Map<String, Integer> person;

  public static void main(String[] args) throws IOException {
    inputs();
    solution();
  } 

  private static void solution() {
    ArrayList<String> list = new ArrayList<>(person.keySet()) ;
    StringBuilder sb = new StringBuilder();

    Collections.sort(list);

    for (String key : list) {
      if (person.get(key) >= 2) {
        sb.append(key).append('\n');
      }
    }

    System.out.println(list.size());
    System.out.println(sb.toString());
  }

  private static void inputs() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    final int sum = N + M;
    person = new HashMap<>();

    for (int i = 0; i < sum; i++) {
      String str = br.readLine();

      if (person.containsKey(str)) {
        person.put(str, person.get(str) + 1);
      } else {
        person.put(str, 1);
      }
    }

    br.close();
  }
}
