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
    int maxDuplicateCount = 1;

    if (maxDuplicateCount == count) return maxDuplicate;

    String tempStr = inputs[0];
    int tempCount = 1;

    for (int i = 1; i < count; i++)  {
      if (!tempStr.equals(inputs[i])) {
        tempStr = inputs[i];
        tempCount = 0;
      }

      tempCount += 1;

      if (tempCount > maxDuplicateCount) {
        maxDuplicate = tempStr;
        maxDuplicateCount = tempCount;
      }
    }

    return maxDuplicate;
  }
}
