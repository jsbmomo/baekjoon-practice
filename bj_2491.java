import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2491 {
  static BufferedReader br;
  static StringTokenizer st;
  static int number;
  static int[] ary;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(br.readLine());
    ary = new int[number];
    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < number; i++) {
      ary[i] = Integer.parseInt(st.nextToken());
    }

    if (ary.length == 1){
      System.out.println("1");
      return ;
    }

    int big = 1;
    int bigMax = 0;
    for (int i = 0; i < number - 1; i++) {
      if (ary[i] <= ary[i + 1]) big++;
      else {
        if (bigMax < big) bigMax = big;
        big = 1;
      }
    }
    if (bigMax < big) bigMax = big;

    
    int small = 1;
    int smallMax = 0;
    for (int i = 0; i < number - 1; i++) {
      if (ary[i] >= ary[i + 1]) small++;
      else {
        if (smallMax < small) smallMax = small;
        small = 1;
      }
    }
    if (smallMax < small) smallMax = small;

    System.out.println(Math.max(bigMax, smallMax));
  }
}
