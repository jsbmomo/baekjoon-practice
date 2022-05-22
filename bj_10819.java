import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// |A[0] - A[1]| + |A[1] - A[2]| + ... + |A[N-2] - A[N-1]|
public class bj_10819 {
  static int count;
  static int[] data;
  static int sum;
  static int max;
  static int temp;

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    count = Integer.parseInt(br.readLine());
    data = new int[count];
    String[] input = br.readLine().split(" ");
    
    for (int i = 0; i < count; i++) {
      data[i] = Integer.parseInt(input[i]);
    }

    Arrays.sort(data);
    
    sum = max = 0;
    for (int i = 0; i < count; i++) { // 배열의 개수만큼 반복한다.
      for (int j = count - 3; j >= 0; j--) {  // 맨 뒤에서부터 2칸 앞을 기준(j)으로 잡고,
        for (int z = 0; z < (count - 1) - j; z++) { // 맨 뒤에서부터 j까지 차례로 위치교환을 하며
          for (int e = 0; e < count - 1; e++) { // 일일이 공식을 적용하여 최대값을 찾는다.  
            sum += Math.abs(data[e] - data[e + 1]);
          }
          
          if (max < sum) {
            max = sum;
          }
          sum = 0;

          temp = data[(count - 1) - z];
          data[(count - 1) - z] = data[(count - 2) - z];
          data[(count - 2) - z] = temp;
        }
      }
    }
    bw.append(max + "\n");
    bw.flush();
    bw.close();
    br.close();
  }
}
