import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11720 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = Integer.parseInt(br.readLine());
    String input = br.readLine();
    int result = 0;

    for (int idx = 0; idx < cnt; idx++) {
      result += Character.getNumericValue(input.charAt(idx));
      System.out.println(result);
    }
    
    System.out.println(result);
  }
  
}
