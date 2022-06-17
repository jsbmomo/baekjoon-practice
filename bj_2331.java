import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 반복수열
 * 
다음과 같이 정의된 수열이 있다.

D[1] = A
D[n] = D[n-1]의 각 자리의 숫자를 P번 곱한 수들의 합
예를 들어 A=57, P=2일 때, 수열 D는 [57, 74(=52+72=25+49), 65, 61, 37, 58, 89, 145, 42, 20, 4, 16, 37, …]이 된다. 
그 뒤에는 앞서 나온 수들(57부터가 아니라 58부터)이 반복된다.

이와 같은 수열을 계속 구하다 보면 언젠가 이와 같은 반복수열이 된다. 
이때, 반복되는 부분을 제외했을 때, 수열에 남게 되는 수들의 개수를 구하는 프로그램을 작성하시오. 

위의 예에서는 [57, 74, 65, 61]의 네 개의 수가 남게 된다.

INPUT : 첫째 줄에 A(1 ≤ A ≤ 9999), P(1 ≤ P ≤ 5)가 주어진다
 */
public class bj_2331 {
  static int squared;
  static int start;
  static List<Integer> values = new ArrayList<Integer>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    start = Integer.parseInt(st.nextToken());
    squared = Integer.parseInt(st.nextToken());

    int number = start;
    while (!values.contains(number)) {
      values.add(number);
      number = getDigitSquaredSum(number);
    }

    int count = 0;
    for (Integer value : values) {
      if (value == number) {
        break;
      }
      count++;
    }

    System.out.println(count);
  }

  public static int getDigitSquaredSum(int target) {
    int result = 0;

    while (target > 0) {
      int temp = target % 10;

      result += Math.pow(temp, squared);

      target /= 10;
    }

    return result;
  }
}
