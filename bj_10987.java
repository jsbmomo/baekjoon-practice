import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10987 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		String str = br.readLine();
		for (int i= 0;i<str.length();i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u')  {
        sum ++;
      }
		}

		System.out.print(sum);
	}
}
