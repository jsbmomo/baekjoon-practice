import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 9명의 난쟁이 중, 2명을 제외한 난쟁이의 키가 100이 되어야 한다.
 * 원래 목표인 7명을 찾지 말고, 2명을 먼저 찾는다는 생각을 해보자.
 */
public class bj_2309 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    final int person = 9;
    final int target = 100;
    int sumAll = 0;

    int[] tall = new int[person];

    for (int i = 0; i < person; i++) {
      tall[i] = Integer.parseInt(br.readLine());
      sumAll += tall[i];
    }

    ArrayList<Integer> result = new ArrayList<>();
    boolean find = false;

    for (int i = 0; i < person; i++) {
      for (int j = i + 1; j < person; j++) {
        if (sumAll - (tall[i] + tall[j]) == target) {
          find = true;

          for (int d = 0; d < person; d++) {
            if (tall[i] != tall[d] && tall[j] != tall[d]) {
              result.add(tall[d]);
            }
          }

          break;
        }
      }

      if (find) break;
    }

    Collections.sort(result);

    StringBuilder sb = new StringBuilder();
    
    for (Integer value : result) {
      sb.append(value).append("\n");
    }

    System.out.println(sb.toString());
    br.close();
  }
}
