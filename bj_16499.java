import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class bj_16499 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final int words = Integer.parseInt(br.readLine());

    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < words; i++) {
      char[] inputs = br.readLine().toCharArray();

      Arrays.sort(inputs);

      String sorted = new String(inputs);

      if (map.containsKey(sorted)) {
        map.put(sorted, map.get(sorted) + 1);
      } else {
        map.put(sorted, 1);
      }
    }

    System.out.println(map.size());
    br.close();
  }
}
