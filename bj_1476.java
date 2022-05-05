import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_1476 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer esm = new StringTokenizer(br.readLine());

    int E = Integer.parseInt(esm.nextToken());
    int S = Integer.parseInt(esm.nextToken());
    int M = Integer.parseInt(esm.nextToken());
    
    int year = 1;
    // int e, s, m;
    // e = s = m = 1;

    while (true) {
      if (((year - E) % 15) == 0 && ((year - S) % 28) == 0 && ((year - M) % 19) == 0) {
        break;
      } else {
        year++;
      }

      // if (((e - E) % 15) == 0 && ((s - S) % 28) == 0 && ((m - M) % 19) == 0) {
      //   break;
      // }

      // year++;
      // e++;
      // s++;
      // m++;
    }

    bw.write(year + "\n");
    bw.flush();
    bw.close();
    br.close();
  }
  
}
