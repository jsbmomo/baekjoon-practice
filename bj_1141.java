import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class bj_1141 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final int count = Integer.parseInt(br.readLine());
    final String[] inputs = new String[count];

    for (int i = 0; i < count; i++) {
      inputs[i] = br.readLine();
    }

    Arrays.sort(inputs, new Comparator<String>() {
      public int compare(String s1, String s2) {
        return Integer.compare(s2.length(), s1.length());
      }
    });

    HashSet<String> hashSet = new HashSet<>();
    boolean isIncludes = false;

    for (String input : inputs) {
      if (hashSet.size() == 0) {
        hashSet.add(input);
        continue;
      }

      isIncludes = true;

      for (String setStr : hashSet) {
        if (setStr.indexOf(input) == 0) {
          isIncludes = false;
          break;
        }
      }

      if (isIncludes) hashSet.add(input);
    }

    System.out.println(hashSet.size());
    br.close();
  }
}
