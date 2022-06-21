import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class bj_1373 {
/**
 * 첫째 줄에 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다.
 * 첫째 줄에 주어진 수를 8진수를 변환하여 출력한다.
 */
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      StringBuilder sb = new StringBuilder();
      String N = br.readLine();

      if (N.length() % 3 == 1)
        sb.append(N.charAt(0));
      if (N.length() % 3 == 2)
        sb.append((N.charAt(0) - '0') * 2 + (N.charAt(1) - '0');
      
      for (int i = N.length() % 3; i< N.length(); i += 3) {
        sb.append((N.charAt(i) - '0') * 4 + (N.charAt(i + 1) - '0') * 2 + (N.charAt(i + 2) - '0'));
      }

      System.out.println(sb);
    } catch (IOException ex) {
      // BufferedReader 사용 시, IOException 필요
    }
  }
}
