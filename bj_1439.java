import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_1439 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arr = br.readLine().split("");

		int countOne = 0;
		int countZero = 0;

		if(arr[0].equals("0")) {
      countZero++;
    } else {
      countOne++;
    }

		for(int i = 1; i<arr.length; i++) {
			if(!arr[i-1].equals(arr[i])) {
				if(arr[i].equals("0")) countZero++;
				else countOne++;
			}
		}
	
    bw.append(Math.min(countZero, countOne) + "\n");
    bw.flush();
    bw.close();
    br.close();
  }
}
