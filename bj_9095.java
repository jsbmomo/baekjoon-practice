import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_9095 {
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count = Integer.parseInt(br.readLine());
    int[] ary = new int[12];

    ary[0] = 0;
    ary[1] = 1;
    ary[2] = 2;
    ary[3] = 4;
    
    for (int idx = 4; idx < ary.length; idx++) {
      ary[idx] = ary[idx - 1] + ary[idx - 2] + ary[idx - 3];
    }

    for (int input = 0; input < count; input++) {
      int target = Integer.parseInt(br.readLine());
      bw.write(ary[target] + "\n");
    }    

    bw.flush();
  }
}
