import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class bj_2721 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cases = Integer.parseInt(br.readLine());

    List<Integer> inputs = new ArrayList<>();

    for (int i = 0; i < cases; i++) {
      inputs.add(Integer.parseInt(br.readLine()));
    }

    System.out.println(solution(inputs));
  }

  private static String solution(List<Integer> inputs) {
    StringBuilder sb = new StringBuilder();

    inputs.stream().forEach(n -> {
      sb.append(IntStream.range(1, n)
              .map(k -> k * (k + 1) * (k + 2) / 2)
              .sum())
        .append("\n");
    });

    sb.setLength(sb.length() - 1);

    return sb.toString();
  }
  
}
