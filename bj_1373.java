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
      String binary = br.readLine();
      int position = 1;
      int result = 0;
    
      int temp = 0;
      int pointer = 1;
      System.out.println(binary.length());
      for (int idx = binary.length() - 1; idx > 0; idx--) {
        if (binary.charAt(idx) == '1') {
          temp += position;
        } 
        if ((idx + 1) % 3 == 0) {
          result += temp * pointer;
          position = 1;
          pointer *= 10;
        } else {
          position *= 2;
        }
      }

      System.out.println(result);
    } catch (IOException ex) {
      // BufferedReader 사용 시, IOException 필요
    }
  }
}
