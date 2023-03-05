import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10974 {
  static StringBuilder sb;
  static int[] ary;
  static int num;
  static boolean[] isSelected;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    num = Integer.parseInt(br.readLine());
    ary = new int[num];
    isSelected = new boolean[num];
    sb = new StringBuilder();

    perm(0);

    System.out.println(sb.toString());

    br.close();
  }

  private static void perm(int count) {
    if (count == num) {
      for (int i = 0; i < num; i++) {
        sb.append(ary[i]).append(" ");
      }
      sb.append("\n");
      return;
    }

    for (int i = 0; i < num; i++) {
      if (isSelected[i]) continue;

      ary[count] = i + 1;
      isSelected[i] = true;
      perm(count + 1);
      isSelected[i] = false;
    }
  }
}
