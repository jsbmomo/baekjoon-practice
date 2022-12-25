import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_4101 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int val1 = Integer.parseInt(st.nextToken());
      int val2 = Integer.parseInt(st.nextToken());
      
      if (val1 == 0 && val2 == 0) {
        break;
      }

      if (val1 > val2) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
    
    br.close();
  }
}
