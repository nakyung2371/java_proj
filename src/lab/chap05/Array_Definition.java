package lab.chap05;

public class Array_Definition {

	public static void main(String[] args) {
		//배열 변수명: arr
			//배열 방의 갯수: 1000개 생성, 0~999, arr.length: 1000
			//배열의 각 방에 3의 배수를 저장(for)
			//배열의 각 방의 내용을 출력(for)

		int[] arr = new int[1000];
		for(int i = 0, j = 1; i < arr.length; i++) {
			arr[i] = j * 3;
			j++;
			System.out.println(arr[i]);
		}
		
		System.out.println("==================================");
		for(int i = 0, j = 3; i < arr.length; i++) {
			arr[i] = j;
			j += 3;
			System.out.println(arr[i]);
		}
	}

}
