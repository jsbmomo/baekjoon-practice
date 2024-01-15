import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_5086 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = null; 
    StringBuilder sb = new StringBuilder();
    
    do {
      st = new StringTokenizer(br.readLine());

      int num1 = Integer.parseInt(st.nextToken());
      int num2 = Integer.parseInt(st.nextToken());

      if (num1 == 0 && num2 == 0) break;

      if (num2 % num1 == 0) sb.append("factor\n");
      else if (num1 % num2 == 0) sb.append("multiple\n");
      else sb.append("neither\n");

    } while (true);

    System.out.println(sb.toString());
    br.close();
  }
}
