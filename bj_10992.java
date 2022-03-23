package codingTest.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class bj_10992 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder str = new StringBuilder();
    int input = Integer.parseInt(br.readLine());
    int blank = 0;
    int cnt = 1;
  
    while(input > cnt) {
      for (int idx = 0; idx < input - cnt; idx++) {
        str.append(' ');
      }
      str.append("*");

      if (cnt != 1) {
        for (int idx = 0; idx < blank * 2 - 1; idx++) {
          str.append(' ');
        }
        str.append("*\n");
      } else {
        str.append('\n');
      }

      cnt++;
      blank++;
    }

    
    for (int idx = 0; idx < input * 2 - 1; idx++) {
      str.append('*');
    }
    
    System.out.println(str.toString());
  }
}
