import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1541 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] inputs = br.readLine().split("-");
    int len = inputs.length;
    int sum = Integer.MAX_VALUE;

    for (int i = 0; i < len; i++) {
      // split의 경우 정규식을 받기에, 그냥 '+' 사용 시 PatternSyntaxException 발생
      // '+'는 메타 문자기에 그대로 사용하기 위해서는 이스케이프 처리를 해주어야 한다.
      String[] addition = inputs[i].split("\\+");

      int temp = 0;

      for (int j = 0; j < addition.length; j++) {
        temp += Integer.parseInt(addition[j]);
      }

      if (sum == Integer.MAX_VALUE) sum = temp;
      else sum -= temp;
    }

    System.out.println(sum);
    br.close();
  }
}
