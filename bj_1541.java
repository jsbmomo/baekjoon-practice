import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1541 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer inputs = new StringTokenizer(br.readLine(), "-");
    StringTokenizer addition;

    int sum = Integer.MAX_VALUE;

    while(inputs.hasMoreTokens()) {
      // split의 경우 정규식을 받기에, 그냥 '+' 사용 시 PatternSyntaxException 발생
      // '+'는 메타 문자기에 그대로 사용하기 위해서는 이스케이프 처리를 해주어야 한다.
      // String[] addition = inputs[i].split("\\+");

      addition = new StringTokenizer(inputs.nextToken(), "+");

      int temp = 0;

      while (addition.hasMoreTokens()) {
        temp += Integer.parseInt(addition.nextToken());
      }

      if (sum == Integer.MAX_VALUE) sum = temp;
      else sum -= temp;
    }

    System.out.println(sum);
    br.close();
  }
}
