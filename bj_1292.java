import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1292 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int a = Integer.parseInt(input[0]);
    int b = Integer.parseInt(input[1]);
    
    int sum = 0, value = 0, index = 0;
    
    while (true) {
      index++; // 현재 출력 중인 정수 순서
      value++; // 출력될 정수

      for (int j = 0; j < value; j++) {
        if (index >= a && b <= index) {
          sum += value;
        }
        index++;
      }
      

      if (index >= b) break;
    }

    System.out.println(sum);
  }
}