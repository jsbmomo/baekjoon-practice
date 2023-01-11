import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_17210 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int doorCount = Integer.parseInt(br.readLine().split(" ")[0]);
    int open = Integer.parseInt(br.readLine().split(" ")[0]);

    if (doorCount > 5) {
      System.out.println("Love is open door");
      return ;
    }

    for (int i = 1; i < doorCount; i++) {
      System.out.println(open = open == 1 ? 0 : 1);
    }

    br.close();
  }
}
