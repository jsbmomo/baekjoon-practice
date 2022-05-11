import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_2739 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int multiplication = Integer.parseInt(br.readLine());

    for (int i = 1; i < 10; i++) {
      bw.write(multiplication + " * " + i + " = " + (multiplication * i) + "\n");
    }
    
    bw.flush();
    bw.close();
  }
}