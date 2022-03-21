package codingTest.baekjoon;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_10809 {
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    String str = bf.readLine();
    StringBuilder builder = new StringBuilder();
    // int[] position = new int[26];
    int[] position = {
      -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
    };
    boolean[] judge = new boolean[26];
    int len = str.length();
    int counter = 0;

    for(int idx = 0; idx < len; idx++) {
      if(!judge[str.charAt(idx) - 97]) {
        position[str.charAt(idx) - 97] = counter;
        judge[str.charAt(idx) - 97] = true;
      }
      counter++;
    }
    

    for(int val : position){
      builder.append(val);
      builder.append(' ');
    }
    
    System.out.println(builder);

    bf.close();
  }
  
}
