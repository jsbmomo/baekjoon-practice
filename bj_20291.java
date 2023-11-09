import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class bj_20291 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    final int inputCount = Integer.parseInt(br.readLine());

    HashMap<String, Integer> file = new HashMap<>();

    for (int i = 0; i < inputCount; i++) {
      String extension = br.readLine().split("[.]")[1];
      
      if (file.containsKey(extension)) {
        file.put(extension, file.get(extension) + 1);
      } else {
        file.put(extension, 1);
      }
    }

    List<String> keyList = new ArrayList<>(file.keySet());
    keyList.sort((s1, s2) -> s1.compareTo(s2));

    for (String key : keyList) {
      sb.append(String.format("%s %d\n", key, file.get(key)));
    }

    System.out.println(sb.toString());
    br.close();
  }
}
