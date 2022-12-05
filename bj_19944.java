import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_19944 {
  final static String NEWBLE = "NEWBIE!";
  final static String OLDBIE = "OLDBIE!";
  final static String TLE = "TLE!";

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int m = Integer.parseInt(input[1]);
    
    String result = NEWBLE;

    if (m > 2) {
      result = n >= m ? OLDBIE : TLE;
    }

    System.out.println(result);
    br.readLine();
  }
}
