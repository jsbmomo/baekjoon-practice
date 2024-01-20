import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class bj_7785 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    final int regist = Integer.parseInt(br.readLine());

    ArrayList<String> person = new ArrayList<>();
    String[] inputs;

    for (int i = 0; i < regist; i++) {
      inputs = br.readLine().split(" ");

      if (inputs[1].equals("enter")) {
        person.add(inputs[0]);
      }

      if (inputs[1].equals("leave")) {
        person.remove(inputs[0]);
      }
    }

    Collections.sort(person, Collections.reverseOrder());

    StringBuilder sb = new StringBuilder();

    for (String p : person) {
      sb.append(p).append("\n");
    }

    System.out.println(sb.toString());
    br.close();
  }
}
