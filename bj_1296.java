import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_1296 {
  static BufferedReader br;
  static String love = "LOVE";
  static String winning = "";
  static String name;
  static int[] nameCount = new int[love.length()];
  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    name = br.readLine();
    int inputCount = Integer.parseInt(br.readLine());
    int maxMatch = 0;

    // 연두의 영어 이름에서 LOVE의 철자와 비교 및 개수 저장
    for (int i = 0; i < love.length(); i++) {
      for (int j = 0; j < name.length(); j++) {
        if (love.charAt(i) == name.charAt(j)) nameCount[i]++;
      }
    }

    for (int i = 0; i < inputCount; i++) {
      String teamName = br.readLine();
      int percent = compareToChar(teamName);
      
      if (percent == maxMatch && !winning.equals("")) {
        String[] ary = new String[2];
        ary[0] = winning.toString();
        ary[1] = teamName;
        
        Arrays.sort(ary);
        winning = ary[0];
      }

      if (percent > maxMatch) {
        maxMatch = percent;
        winning = teamName;
      }
    }

    System.out.println(winning);
    br.close();
  }

  public static int compareToChar(String teamName) {
    int[] compareCount = new int[teamName.length()];

    for (int i = 0; i < name.length(); i++) {
      for (char c : teamName.toCharArray()) {
        System.out.println(c + "  " + name.charAt(i));
        if (c == name.charAt(i)) compareCount[i]++;
      }
    }

    return winningPercent(compareCount);
  }

  public static int winningPercent(int[] count) {
    int percent = 1;

    for (int i = 0; i < count.length; i++) {
      
      for (int j = i + 1; j < count.length; j++) {
        percent *= (count[i] + count[j]);
      }
    }

    System.out.println(percent + "  " + percent % 100);

    return percent % 100;
  }
}