import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_2966 {
  static char[] adrian = {'A', 'B', 'C'};
  static char[] bruno = {'B', 'A', 'B', 'C'};
  static char[] goran = {'C', 'C', 'A', 'A', 'B', 'B'};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count = Integer.parseInt(br.readLine());

    char[] answer = br.readLine().toCharArray();

    int aAnswer = 0;
    int bAnswer = 0;
    int gAnswer = 0;

    for (int i = 0; i < answer.length; i++) {
      if (answer[i] == adrian[i % 3]) aAnswer++;
      if (answer[i] == bruno[i % 4]) bAnswer++;
      if (answer[i] == goran[i % 6]) gAnswer++;
    }

    int max = Math.max(aAnswer, Math.max(bAnswer, gAnswer));

    bw.append(String.valueOf(max)).append("\n");

    if (aAnswer == max) bw.append("Adrian\n");
    if (bAnswer == max) bw.append("Bruno\n");
    if (gAnswer == max) bw.append("Goran\n");
    
    bw.flush();
    bw.close();
    br.close();
  }
}
