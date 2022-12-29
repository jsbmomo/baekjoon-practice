import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_23841 {
  public static void main(String[] args) throws IOException {
    // 입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input01 = br.readLine().split(" ");
    final int rows = Integer.parseInt(input01[0]);
    final int cols = Integer.parseInt(input01[1]);

    char[][] picture = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
        picture[i] = br.readLine().toCharArray();
    }

    //출력
    System.out.print(solution(rows, cols, picture));

}

private static String solution(int rows, int cols, char[][] picture) {
    StringBuilder sb = new StringBuilder();
    final int HalfCols = cols / 2;

    for (int i = 0; i < rows; i++) {
        StringBuilder sbBefore = new StringBuilder();
        StringBuilder sbAfter = new StringBuilder();
        for (int j = 0; j < HalfCols; j++) {
            char curChar = picture[i][j];
            char curCharMatch = picture[i][cols - j - 1];

            if (curChar != curCharMatch) {
                if (curChar == '.') {
                    sbBefore.append(curCharMatch);
                    sbAfter.insert(0, curCharMatch);
                } else if (curCharMatch == '.') {
                    sbBefore.append(curChar);
                    sbAfter.insert(0, curChar);
                }
            } else {
                sbBefore.append(curChar);
                sbAfter.insert(0, curChar);
            }
        }
        sbBefore.append(sbBefore).append(sbAfter);
        sb.append("\n");
    }

    return sb.toString();
}
}