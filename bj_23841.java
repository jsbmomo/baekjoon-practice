import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_23841 {
  static BufferedReader br = null;
  static StringTokenizer st = null;
  static StringBuilder sb = null;

  static int line;
  static int ch;

  static String[] inputs;

  public static void main(String[] args) throws IOException {
    userInput();
    System.out.println(solution());
  }

  static void userInput() throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    st = new StringTokenizer(br.readLine());

    line = Integer.parseInt(st.nextToken());
    ch = Integer.parseInt(st.nextToken());

    inputs = new String[line];

    for (int i = 0; i < line; i++) {
      inputs[i] = br.readLine();
    }

    br.close();
  }

  static String solution() {
    StringBuilder result = new StringBuilder();

    for (String input : inputs) {
      char[] decalcomanie = new char[input.length()];

      for (int i = 0; i < ch / 2; i++) {
        if (input.charAt(i) != '.'  || input.charAt(input.length() - 1 - i) != '.') {
          char c = input.charAt(i) == '.' ? input.charAt(input.length() - 1 - i) : input.charAt(i);
          decalcomanie[i] = c;
          decalcomanie[input.length() - 1 - i] = c;
        } else {
          decalcomanie[i] = '.';
          decalcomanie[input.length() - 1 - i] = '.';
        }
      }
      
      result.append(String.valueOf(decalcomanie)).append('\n');
    }

    return result.toString();
  }
}