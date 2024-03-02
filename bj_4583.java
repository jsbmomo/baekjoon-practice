import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_4583 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder result = new StringBuilder();

    String input;

    while (true) {
      input = br.readLine();

      if (input.equals("#")) break;

      result.append(checkCharater(input));
      result.append('\n');
    }

    System.out.println(result.toString());
    br.close();
  }

  static String checkCharater(String str) {
    StringBuilder sb = new StringBuilder();

    for (int i = str.length() - 1; i >= 0; i--) {
      char c = str.charAt(i);

      switch (c) {
        case 'b':
          sb.append('d');
          break;
        case 'd':
          sb.append('b');
          break;
        case 'p':
          sb.append('q');
          break;
        case 'q':
          sb.append('p');
          break;
        case 'i':
          sb.append(c);
          break;
        case 'o':
          sb.append(c);
          break;
        case 'v':
          sb.append(c);
          break;
        case 'w':
          sb.append(c);
          break;
        case 'x':
          sb.append(c);
          break;
        default:
          return "INVALID";
      }
    }

    return sb.toString();
  }
}
