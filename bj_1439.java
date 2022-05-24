import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_1439 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String input = br.readLine();

    // case 1.
		// int one = 0;
		// int zero = 0;
		// if(input.charAt(0) == '0') {
    //   zero++;
    // } else {
    //   one++;
    // }
    // for(int i = 1; i < input.length(); i++) {
    //   if (input.charAt(i - 1) != input.charAt(i)) {
    //     if (input.charAt(i) == '0') {
    //       zero++;
    //     } else {
    //       one++;
    //     }
    //   }
		// }

    // case 2.
    // int count = 0;
		// for(int i = 1; i < input.length(); i++) {
    //   if (input.charAt(i - 1) != input.charAt(i)) {
    //     count++;
    //   }
		// }
    // bw.append(((count + 1) / 2) + "\n");

    // case 3.
    int count = 0;
		for(int i = 1; i < input.length(); i++) {
      if (input.charAt(i - 1) != input.charAt(i)) {
        count++;
      }
		}

    bw.append(((count + 1) / 2) + "\n");
    bw.flush();
    bw.close();
    br.close();
  }
}
