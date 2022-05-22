import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// |A[0] - A[1]| + |A[1] - A[2]| + ... + |A[N-2] - A[N-1]|
public class bj_10819 {
  static int count;
  static int[] values;
  static int sum;
  static int max;
  static int temp;

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    count = sc.nextInt();
    values = new int[count];
    
    for (int i = 0; i < count; i++) {
      values[i] = sc.nextInt();
    }

    Arrays.sort(values);
    
    sum = 0;
    max = 0;
    int cnt = 0;
    for (int i = 0; i < count; i++) { // 배열의 개수만큼 반복한다.
      for (int j = count - 3; j >= 0; j--) {  // 맨 뒤에서부터 2칸 앞을 기준(j)으로 잡고,
        for (int z = 0; z < (count - 1) - j; z++) { // 맨 뒤에서부터 j까지 차례로 위치교환을 하며
          for (int e = 0; e < count - 1; e++) { // 일일이 공식을 적용하여 최대값을 찾는다.  
            sum += Math.abs(values[e] - values[e + 1]);
          }
          
          if (max < sum) {
            max = sum;
          }
          sum = 0;
          cnt++;

          temp = values[(count - 1) - z];
          values[(count - 1) - z] = values[(count - 2) - z];
          values[(count - 2) - z] = temp;
        }
      }
    }
    System.out.println(max);
    System.out.println(cnt);

    sc.close();
  }
}
