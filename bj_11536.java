import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11536 {


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final int count = Integer.parseInt(br.readLine());
		String[] names = new String[count];
    int status = 0;

    for (int i = 0; i < count; i++) {
      names[i] = br.readLine();
    }

    for (int i = 0; i < count - 1; i++) {
      status += names[i].compareTo(names[i + 1]) > 0 ? 1 : -1;
    }

		if(status == count - 1) {
			System.out.println("DECREASING");
		}else if(status ==1 - count) {
			System.out.println("INCREASING");
		}else {
			System.out.println("NEITHER");
		}
  }
}
