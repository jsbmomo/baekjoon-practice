import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_10824 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer input = new StringTokenizer(br.readLine(), " ");
    
    StringBuilder odd = new StringBuilder();
    StringBuilder even = new StringBuilder();

    odd.append(input.nextToken());
    odd.append(input.nextToken());

    even.append(input.nextToken());
    even.append(input.nextToken());

    long result = Long.parseLong(odd.toString()) + Long.parseLong(even.toString());

    System.out.println(result);
  }
}
