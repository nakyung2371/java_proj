package lab.chap06;

public class Product_Test {

	public static void main(String[] args) {
		//1. Product 객체 4개 생성
		Product pro1 = new Product();
		Product pro2 = new Product();
		Product pro3 = new Product();
		Product pro4 = new Product();
				
		//2. Setter를 사용해서 객체의 필드의 값을 주입
		pro1.setIdx(1);
		pro1.setProName("텀블러");
		pro1.setQty(2);
		pro1.setYear(2000);
		pro1.setProColor("검정색");
		
		pro2.setIdx(2);
		pro2.setProName("휴대폰");
		pro2.setQty(10);
		pro2.setYear(2023);
		pro2.setProColor("흰색");
		
		pro3.setIdx(3);
		pro3.setProName("키보드");
		pro3.setQty(3);
		pro3.setYear(1999);
		pro3.setProColor("분홍색");
		
		pro4.setIdx(4);
		pro4.setProName("가방");
		pro4.setQty(57);
		pro4.setYear(2011);
		pro4.setProColor("노란색");
		
		//3. 배열 arr, 방크기는 10개: 0~9, 각 방에 4개의 객체를 배열 방에 넣음
		Product[] arr = new Product[10];
		
		arr[0] = pro1;
		arr[1] = pro2;
		arr[2] = pro3;
		arr[3] = pro4;
		
		//4. 배열의 값을 꺼내서 Product 변수에 담고 출력
		for(int i = 0; i < arr.length; i++) {
			Product pro = arr[i];
			if (arr[i] == null) {
				continue;
			}
			
			System.out.println(arr[i]);
		}
			
	}

}
