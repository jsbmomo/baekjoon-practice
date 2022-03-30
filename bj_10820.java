import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj_10820 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int line = Integer.parseInt(br.readLine());
    
    for (int i = 0; i < line; i++) {
      String input = br.readLine();

      for (int j = 0; j < input.length(); j++) {
        int[] cnt = new int[4];

        if (input.charAt(j) >= 'a' && input.charAt(j) <= 'z') {
          cnt[0]++;
        }

        if (input.charAt(j) >= 'A' && input.charAt(j) <= 'Z') {
          cnt[1]++;
        }
        
        if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
          cnt[2]++;
        }
        
        if (input.charAt(i) == ' ') {
          cnt[3]++;
        }
        
      }
    }
  }
}
