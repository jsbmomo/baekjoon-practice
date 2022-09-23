import java.util.Scanner;

public class bj_1193 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int loc = sc.nextInt();

		int crossCount = 1, prevCountSum = 0;

		while (true) {
        
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if (loc <= prevCountSum + crossCount) {	
				
				if (crossCount % 2 == 1) {	// 대각선의 개수가 홀수라면 
					// 분자가 큰 수부터 시작
					// 분자는 대각선상 내의 블럭 개수 - (loc 번째 - 직전 대각선까지의 블럭 개수 - 1) 
					// 분모는 loc 번째 - 직전 대각선까지의 블럭 개수
					System.out.print((crossCount - (loc - prevCountSum - 1)) + "/" + (loc - prevCountSum));
					break;
				} 
				else {
					// 홀수일 때의 출력을 반대로 
					System.out.print((loc - prevCountSum) + "/" + (crossCount - (loc - prevCountSum - 1)));
					break;
				}

			} else {
				prevCountSum += crossCount;
				crossCount++;
			}
    }

    sc.close();
  }
}
