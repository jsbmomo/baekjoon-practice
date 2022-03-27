import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class bj_10826 {

	private static BigInteger[] bi;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());

		
		if (input < 2) {
			System.out.println(input);
			return;
		}

		bi = new BigInteger[input + 1];
		bi[0] = BigInteger.ZERO;
		bi[1] = BigInteger.ONE;

		for (int idx = 2; idx <= input; idx++) {
			bi[idx] = bi[idx - 2].add(bi[idx - 1]);
		}
    
		System.out.println(bi[input]);
  }
  
}
