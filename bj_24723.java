import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_24723 {
  public static void main(String[] args) throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
    int height = Integer.parseInt(br.readLine());
    int total = 1;
    
    while (height-- > 0) total *= 2;

    System.out.println(total);

    br.close();
  }
}
