import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10814 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int inputCount = Integer.parseInt(br.readLine());
    String[][] person = new String[inputCount][2];

    String beforeSplit;
    for (int i = 0; i < inputCount; i++) {
      beforeSplit = br.readLine();
      person[i] = beforeSplit.split(" ");
    }

    String[][] temp = new String[1][2];
    for (int i = 0; i < inputCount; i++) {
      for (int j = i + 1; j < inputCount; j++) {
        if (Integer.parseInt(person[i][0]) > Integer.parseInt(person[j][0])) {
          temp[0] = person[i];
          person[i] = person[j];
          person[j] = temp[0];
        } else if (Integer.parseInt(person[i][0]) == Integer.parseInt(person[j][0])) {
          if (person[i][1].charAt(0) > person[j][1].charAt(0)) {
            temp[0] = person[i];
            person[i] = person[j];
            person[j] = temp[0];
          }      
        }
      }
    }

    for (String[] str : person) {
      System.out.println(str[0] + " " + str[1]);
    }
  }
  
}
