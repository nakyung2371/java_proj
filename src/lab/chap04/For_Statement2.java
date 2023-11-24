package lab.chap04;

public class For_Statement2 {

	public static void main(String[] args) {
		/*
		  실습: 2중 for문을 사용해서 1 ~ 19단까지 출력
 		  		- 6단, 7단, 12단 제외 후 출력
 		 */
		
		System.out.println("----------------구구단 출력----------------");
		for (int i = 1; i < 20; i++) {
			if (i == 6 || i == 7 || i == 12) {
				continue;
			}
			System.out.println("------------" + i + "단------------");
			for (int j = 1; j < 20; j++) {
//				if (i == 6 || i == 7 || i == 12) {
//					continue;
//				}
			System.out.printf("%d * %d = %d\t", i, j, i * j);
			}
			System.out.println();
			System.out.println();
		}
	}
}

