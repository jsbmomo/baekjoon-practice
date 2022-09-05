import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_10807 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String temp = br.readLine();
    int count = Integer.parseInt(temp.substring(0, temp.length() - 1));
    int result = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    temp = br.readLine();

    String target = temp.substring(0);

    while (st.hasMoreTokens()) {
      if (target.equals(st.nextToken())) {
        result++;
      }
    }

    // String[] values = br.readLine().split(" ");
    // temp = br.readLine();

    // String target = temp.substring(0);
    // for (String value : values) {
    //   System.out.println(value + "  " + target);
    //   if (value.equals(target)) {
    //     result++;
    //   }
    // }
    
    System.out.println(result);
    br.close();
  }
}
