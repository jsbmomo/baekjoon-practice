import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1924 {

  static int[] month = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
  static String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int day = 0;
    int inputMonth = Integer.parseInt(st.nextToken());

    for (int i = 1; i < inputMonth; i++) {
      day += month[i];
    }
    day += Integer.parseInt(st.nextToken());

    System.out.println(week[day % 7]);
  }
  
}
