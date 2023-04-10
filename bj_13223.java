import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_13223 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] currentTime = br.readLine().split(":");
    String[] endTime = br.readLine().split(":");

    int currentHour = Integer.parseInt(currentTime[0]);
    int currentMinute = Integer.parseInt(currentTime[1]);
    int currentSecond = Integer.parseInt(currentTime[2]);
    int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;
    
    int endHour = Integer.parseInt(endTime[0]);
    int endMinute = Integer.parseInt(endTime[1]);
    int endSecond = Integer.parseInt(endTime[2]);
    int endSecondAmount = endHour * 3600 + endMinute * 60 + endSecond;

    int needSecondAmount = endSecondAmount - currentSecondAmount;

    /**
     * 문제의 조건을 보면 1초보다 크고 24시간보다 작은 값이 나와야한다.
     * 고로, 00:00:00 은 나올 수 없다.
     */
    if (needSecondAmount <= 0) {
      needSecondAmount += 24 * 3600;
    }
    
    int needHour = needSecondAmount / 3600;
    int needMinute = (needSecondAmount % 3600) / 60;
    int needSecond = needSecondAmount % 60;

    System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
    br.close();
  }
}
