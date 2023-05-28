import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제
 * 타로는 자주 JOI잡화점에서 물건을 산다. 
 * JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고, 
 * 언제나 거스름돈 개수가 가장 적게 잔돈을 준다. 
 * 
 * 타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 
 * 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.
 * 
 * ex) 
 * input: 380, output: 4
 * input: 1, output: 15
 */
public class bj_5585 {
  // static int[] jpy = { 1, 5, 10, 50, 100, 500 };
  static int[] jpy = { 500, 100, 50, 10, 5, 1 };
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int pay = Integer.parseInt(br.readLine());
    int count = 0, index = 0;

    int change = 1000 - pay;

    while (change > 0) {
      int temp = change / jpy[index];
      count += temp;
      change -= temp * jpy[index];
      index++;
    } 

    System.out.println(count);
  }
}
