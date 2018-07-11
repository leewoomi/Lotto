package lotto;

import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {

		// 1부터 45까지 중복되지 않는 6개의 정수 저장
		// 데이터를 저장할 배열 생성

		int[] lotto = new int[6];
		// int[] u = new int[6];
		int size = lotto.length;// 데이터 개수
		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 45까지 정수 중 로또 번호 6개 입력 ");
		for (i = 0; i < size; i++) {
			try {
				String tmp = sc.nextLine();
				lotto[i] = Integer.parseInt(tmp);
				// 1부터 45까지 정수가 아닐 때
				if (!(lotto[i] >= 1 && lotto[i] <= 45)) {
					// == if(lotto[i]<1 || lotto[i] >45){}
					System.out.println("1부터 45까지의 정수만 입력하세요.");
					i = i - 1;
					continue;

				}
				// 중복 검사
				for (j = 0; j <= i - 1; j++) {
					if (lotto[i] == lotto[j]) {
						//이전 데이터와 방금 입력받은 데이터가 같으면 반복문 종료
					break;
					}
				}
				//이전 데이터와 방금 입력받은 데이터가 동일 하면
				if(j !=i) {
					System.out.println("동일한 데이터는 안됩니다.");
					i=i-1;
					continue;
				}
				
			} catch (Exception e) {
				System.out.println("정수를 입력하세요.");
				// 이런 경우 무효화
				i = i - 1;
			}

		}
		// 배열의 모든 데이터 출력
		System.out.println("\n입력한 로또 번호 6개 출력");
		System.out.print("[");
		for (i = 0; i < size; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		System.out.print("]");

		// 랜덤
		// System.out.println("\n로또 번호 6개 출력");
		// for (i = 0; i < size; i++) {
		// lotto[i] = (int) (Math.random() * 45 + 1);
		// System.out.print(lotto[i] + "\t");
		// }
		sc.close();
	}

}
