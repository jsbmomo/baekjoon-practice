import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_2711 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int inputCount = Integer.parseInt(br.readLine());
    String[] inputString = new String[inputCount];

    for (int i = 0; i < inputCount; i++) {
      inputString[i] = br.readLine();
    }

    for (int i = 0; i < inputCount; i++) {
      String[] splitString = inputString[i].split(" ");
      int position = Integer.parseInt(splitString[0]) - 1;
      StringBuilder sb = new StringBuilder(splitString[1]);

      bw.append(sb.deleteCharAt(position) + "\n");
    }

    bw.flush();
    br.close();
    bw.close();
  }
}
