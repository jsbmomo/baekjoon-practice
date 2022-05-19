import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_10942 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int count = Integer.parseInt(br.readLine());
    StringTokenizer inputIntValue = new StringTokenizer(br.readLine());
    int answer = Integer.parseInt(br.readLine());

    StringBuilder values = new StringBuilder();
    while (inputIntValue.hasMoreTokens()) {
      values.append(inputIntValue.nextToken());
    }

    String question;
    int startIndex;
    int endIndex;
    boolean palindromeJudge = true;

    for (int number = 0; number < answer; number++) {
      question = br.readLine();
      startIndex = Integer.parseInt(question.split(" ")[0]) - 1;
      endIndex = Integer.parseInt(question.split(" ")[1]) - 1;

      palindromeJudge = true;
      for (int front = startIndex, back = 0; front < (endIndex - startIndex / 2); front++, back++) {
        System.out.println(
          "front: " + front + ", " + values.charAt(front) + " | " + 
          "Back: " + (endIndex - back) + ", " + values.charAt(endIndex - back)
        );
        System.out.println("Index of Back: " + back);
        if (values.charAt(front) != values.charAt(endIndex - back)) {
          palindromeJudge = false;
          break;
        }
      }

      if (palindromeJudge){
        bw.append('1').append('\n');
      } else {
        bw.append('0').append('\n');
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
