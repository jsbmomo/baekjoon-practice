import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class bj_11650 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int SIZE = Integer.parseInt(br.readLine());
    int[][] ary = new int[SIZE][SIZE];

    for (int idx = 0; idx < SIZE; idx++) {
      StringTokenizer str = new StringTokenizer(br.readLine(), " ");
      ary[idx][0] = Integer.parseInt(str.nextToken());
      ary[idx][1] = Integer.parseInt(str.nextToken());
    }

    sortDimensionalAry(ary);
    
  }

  public static void sortDimensionalAry(int[][] inputAry) {
    int len = inputAry.length;

    for (int i = 1; i < len; i++) {
      int[][] temp = new int[1][2];
      System.arraycopy(inputAry[i], 0, temp[0], 0, 2);
      
      int j;
      for (j = i - 1; j >= 0; j--) {
        if (temp[0][0] < inputAry[j][0]) {
          System.arraycopy(inputAry[j], 0, inputAry[i], 0, 2);    

        } else if (temp[j][0] == inputAry[i][0]) {

          if (temp[j][1] < inputAry[i][1]) {
            System.arraycopy(inputAry[j], 0, inputAry[i], 0, 2);    
          }
        }
      }
    }

  }

}


/**
 * 1. git add bj_11650.java
 * 2. git commit -m ""
 * 3. git push origin
 */