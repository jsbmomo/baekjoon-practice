import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2490 {
  static char[] result = {'D','C','B','A','E'};
  static int index;
  static BufferedReader br;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    
    for (int i = 0; i < 3; i++) {
      index = 0;
      for (String num : br.readLine().split(" ")) {
        if (num.equals("1")) {
          index++;
        }
      }
      System.out.println(result[index]);
    }
    
    br.close();
  }
}
