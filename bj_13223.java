import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_13223 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] startTime = br.readLine().split(":");
    String[] endTime = br.readLine().split(":");

    int[] needTime = new int[3];
    
    for (int i = 2; i >= 0; i--) {
      needTime[i] = Integer.parseInt(endTime[i]) - Integer.parseInt(startTime[i]);
    }

    if (needTime[2] < 0) {
      needTime[1]--;
      needTime[2] += 60;
    }

    if (needTime[1] < 0) {
      needTime[0]--;
      needTime[1] += 60;
    }

    if (needTime[0] < 0) {
      needTime[0] += 24;
    }

    System.out.println(String.format("%02d:%02d:%02d", needTime[0], needTime[1], needTime[2]));
    br.close();
  }
}
