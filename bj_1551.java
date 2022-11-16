import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class bj_1551 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    Integer ary[][] = new Integer[101][3];

    for (int i = 0; i < ary.length; i++) {
      for (int j = 0; j < ary[i].length; j++) {
        ary[i][j] = 0;
      }
    }
    
    int nation[] = new int[101];

    for (int i = 0; i < count; i++) {
      for (int j = 0; j < 3; j++) {
        ary[i][j] = sc.nextInt();
      }
    }

    Arrays.sort(ary, new Comparator<Integer[]>() {
      @Override
      public int compare(Integer[] o1, Integer[] o2) {
        return Integer.compare(o2[2], o1[2]);
      }
    });

    int res[][] = new int[3][2];
    int idx = 0;

    for (int i = 0; i < count; i++) {
      if (i < 2) {
        res[idx][0] = ary[i][0];
        res[idx][0] = ary[i][1];
        idx++;
        nation[ary[i][0]]++;
      } else if (nation[ary[i][0]] >= 2) {
        continue;
      } else {
        res[idx][0] = ary[i][0];
        res[idx][0] = ary[i][1];
        break;
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.println(res[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}
