import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_1302 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    String[] inputs = new String[count];

    for (int i = 0; i < count; i++) {
      inputs[i] = br.readLine();
    }

    Arrays.sort(inputs);

    System.out.println(findMaxDuplicate(inputs, count));

    br.close();
  }

  static String findMaxDuplicate(String[] inputs, int count) {
    String maxDuplicate = inputs[0];
    String tempStr = inputs[0];
    int maxDuplicateCount = 1;
    int tempCount = 0;
    
    if (count == 1) return maxDuplicate;

    for (int i = 1; i < count; i++)  {
      if (tempStr == inputs[i]) {
        tempCount += 1;
        continue;
      }

      if (tempCount > maxDuplicateCount) {
        maxDuplicate = inputs[i];
        maxDuplicateCount = tempCount;
      }

      tempStr = inputs[i];
      tempCount = 1;
    }

    return maxDuplicate;
  }
}
