import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_2750 {
  /**
  N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

  입력
  첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 
  둘째 줄부터 N개의 줄에는 수 주어진다. 
  이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

  출력
  첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
   */
  static int[] array = new int[1001]; // 0 ~ 1000

  public static void main(String[] args) throws IOException {
    int number = 0, min = 0, index = 0, temp = 0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    number = Integer.parseInt(br.readLine());

    for (int i = 0; i < number; i++) {
      array[i] = Integer.parseInt(br.readLine());
    }

    for (int i = 0; i < number; i++) {
      min = 1001; // 항상 들어오는 값보다 큰 값을 대입
      for (int j = i; j < number; j++) {
        if (min > array[j]) { // 현재 검사 값이 현재 최소값 보다 작다면 
          min = array[j];
          index = j;
        }
      }

      temp = array[i];
      array[i] = array[index];
      array[index] = temp;
    }

    for (int i = 0; i < number; i++) {
      bw.append(array[i] + "\n");
    }
    
    bw.flush();
    bw.close();
    br.close();
  }
}
