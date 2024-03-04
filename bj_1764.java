import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;


public class bj_1764 {
  
  static int N, M;
  static List<String> unknown;

  public static void main(String[] args) throws IOException {
    inputs();
    solution();
  } 

  private static void solution() {
    StringBuilder sb = new StringBuilder();

    Collections.sort(unknown);

    for (String s : unknown) {
      sb.append(s).append('\n');
    }

    System.out.println(unknown.size());
    System.out.println(sb.toString());
  }

  private static void inputs() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    Set<String> person = new HashSet<>();
    unknown = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      person.add(br.readLine());
    }

    for (int i = 0; i < M; i++) {
      String s = br.readLine();

      if (person.contains(s)) {
        unknown.add(s);
      }
    }

    br.close();
  }
}
