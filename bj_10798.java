import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10798 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    char[][] inputs = new char[5][15];

    for (int i = 0; i < 5; i++) {
      char[] input = br.readLine().toCharArray();

      for (int j = 0; j < input.length; j++) {
        inputs[i][j] = input[j];
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 5; j++) {
        if (inputs[j][i] != '\0')
          sb.append(inputs[j][i]);
      }
    }

    System.out.println(sb.toString());
    br.close();
  }
}
