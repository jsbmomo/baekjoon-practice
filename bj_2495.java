import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_2495 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int count = 1;
    int max = 0;
    char temp = '0';

    for (int i = 0; i < 3; i++) {
      char[] numAry = br.readLine().toCharArray();
      temp = numAry[0];
      for (int j = 1; j < numAry.length; j++) {
        if (temp == numAry[j]) {
          count++;
        } else {
          temp = numAry[j];
          max = count > max ? count : max;
          count = 1;
        }
      }

      bw.append(max + "\n");
      temp = '0';
      count = 1;
      max = 0;
    }
    
    bw.flush();
    bw.close();
    br.close();
  }
}
