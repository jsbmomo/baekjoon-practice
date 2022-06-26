import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
수빈이는 TV를 보고 있다. 수빈이는 채널을 돌리려고 했지만, 버튼을 너무 세게 누르는 바람에, 
일부 숫자 버튼이 고장났다.
리모컨에는 버튼이 0부터 9까지 숫자, +와 -가 있다. 
+를 누르면 현재 보고있는 채널에서 +1된 채널로 이동하고, -를 누르면 -1된 채널로 이동한다. 
채널 0에서 -를 누른 경우에는 채널이 변하지 않고, 채널은 무한대 만큼 있다.
수빈이가 지금 이동하려고 하는 채널은 N이다. 어떤 버튼이 고장났는지 주어졌을 때, 
채널 N으로 이동하기 위해서 버튼을 최소 몇 번 눌러야하는지 구하는 프로그램을 작성하시오. 
수빈이가 지금 보고 있는 채널은 100번이다.

- 입력
첫째 줄에 수빈이가 이동하려고 하는 채널 N (0 ≤ N ≤ 500,000)이 주어진다.  
둘째 줄에는 고장난 버튼의 개수 M (0 ≤ M ≤ 10)이 주어진다. 
고장난 버튼이 있는 경우에는 셋째 줄에는 고장난 버튼이 주어지며, 
같은 버튼이 여러 번 주어지는 경우는 없다.

- 출력
첫째 줄에 채널 N으로 이동하기 위해 버튼을 최소 몇 번 눌러야 하는지를 출력한다.
 */
public class bj_1107 {
  static int START = 100;
  static int MINUS = -1;
  static int PLUS = 1;

  static ArrayList<Integer> brokenButton = new ArrayList<>();
  static int channel;
  static int brokenCount;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    channel = Integer.parseInt(br.readLine());
    brokenCount = Integer.parseInt(br.readLine());

    troubleButtonList(br.readLine());    

    int ans = Math.abs(100 - channel);

    int mini = 987654321;
    int cnt = 0;

    for (int i = 0; i <= 999999; i++) {
      String str = String.valueOf(i);
      boolean chk = true;

      for (int k = 0; k < str.length(); k++) {
        if (brokenButton.contains(str.charAt(k) - '0')) {
          chk = false;
          break;
        }
      }

      if (chk == false) {
        continue;
      }

      cnt = str.length() + Math.abs(i - channel);

      if (cnt < mini) {
        mini = cnt;
      }
    }

    if (mini < ans) {
      ans = mini;
    }

    bw.append(ans + "\n");
    bw.flush();

    br.close();
    bw.close();
  }


  public static void troubleButtonList(String broken) {
    String[] input = broken.split(" ");

    for (String value : input) {
      brokenButton.add( Integer.parseInt(value) );
    }
  }
  
}
