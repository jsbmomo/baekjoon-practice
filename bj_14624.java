import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_14624 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int input = Integer.parseInt(br.readLine());

    if (input % 2 == 0) {
      System.out.println("I LOVE CBNNU");
      return ;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < input; i++) {
      sb.append('*');
    }
    sb.append('\n');


    int line = (int) Math.ceil((double)input / 2);
    int last = line - 1;
    int space = -1;
    for (int i = 0; i < line; i++) {
      for (int j = 0; j < last; j++) {
        if (space >= 0 && j == space) {
          sb.append('*');
        } else {
          sb.append(' ');
        }
      }
      sb.append("*\n");
      last++;
      space = last - ((i + 1) * 2);
      System.out.println(space);
    }

    bw.append(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}
