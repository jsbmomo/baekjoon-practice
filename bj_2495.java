import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_2495 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < 3; i++) {
      char[] numAry = br.readLine().toCharArray();
      char temp = numAry[0];
      int count = 1;
      int max = 0;
      int aryLastIndex = numAry.length - 1; // 예제 마지막 값에 ' '이 포함됨
      int len = numAry[aryLastIndex] == ' ' ? aryLastIndex - 1 : aryLastIndex;

      for (int j = 1; j <= len; j++) {
        if (temp == numAry[j]) {
          count++;
        } else {
          temp = numAry[j];
          max = count >= max ? count : max;
          count = 1;
        }
      }

      // 만약, 8자리 정수가 모두 같은 숫자라면 else를 거치지 않아, max 값은 비게된다.
      sb.append(count >= max ? count : max).append('\n');
    }
    
    bw.append(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}
