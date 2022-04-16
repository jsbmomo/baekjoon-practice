import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11719 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String print = "";

    while ((print = br.readLine()) != null) {
      sb.append(print).append('\n');
    }

    System.out.println(sb);
  }
}
