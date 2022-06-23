import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
 */
public class bj_10872 {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int input = Integer.parseInt(br.readLine());
      int result = 1;

      for (int i = 1; i <=input; i++) {
        result *= i;
      }

      System.out.println(result);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  /* Use Recursion Function */
  // public static int factorial(int value) {
  //   if (value == 0) {
  //     return 1;
  //   }
  //   return value * factorial(--value);
  // }
}