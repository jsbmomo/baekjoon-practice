import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_2752 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] input = new int[st.countTokens()];
    
    for (int i = 0; i < input.length; i++) {
      input[i] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(input);

    for (int val : input) {
      bw.append(val + " ");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
