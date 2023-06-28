import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class bj_25206 {
  static List<Subject> list = null;
  static BufferedReader br = null;
  static StringTokenizer sb = null;

  public static void main(String[] args) throws IOException {
    inputs();

    System.out.printf("%.6f\n", calculateScore());
  }

  private static void inputs() throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));

    list = new ArrayList<>();

    for (int i = 0; i < 20; i++) {
      sb = new StringTokenizer(br.readLine());

      list.add(new Subject(sb.nextToken(), sb.nextToken(), sb.nextToken()));
    }

    br.close();
  }

  private static float calculateScore() {
    float sum = 0.0f;
    float divide = 0.0f;

    float point = 0.0f;
    float scoreToFloat = 0.0f;

    for (Subject subject : list) {
      if ((point = swapGradeToPoint(subject.grade)) >= 0.0f) {
        scoreToFloat = Float.parseFloat(subject.score);
        divide += scoreToFloat;
        sum += (point * scoreToFloat);
      }
    }

    return sum / divide;
  }

  private static float swapGradeToPoint(String grade) {
    switch(grade) {
      case "A+":
        return 4.5f;
      case "A0":
        return 4.0f;
      case "B+":
        return 3.5f;
      case "B0":
        return 3.0f;
      case "C+":
        return 2.5f;
      case "C0":
        return 2.0f;
      case "D+":
        return 1.5f;
      case "D0":
        return 1.0f;
      case "F":
        return 0.0f;
      default:
        return -1.0f;
    }
  }
}


class Subject {
  String name;
  String score;
  String grade;

  public Subject(String name, String score, String grade) {
    this.name = name;
    this.score = score;
    this.grade = grade;
  }
}