package chap03.ex03;

public class LogicalOperator {

	public static void main(String[] args) {
		/*논리 연산자: 결과 값으로 true/false를 리턴(돌려준다) *아주 중요*
			  &&(AND): 모두 true일 때, true
			  		   true && true -> true
			  		   true && false -> false
			  		   false && true -> false
			  		   false && false -> false
			  		   
			  ||(OR): 하나라도 true이면 true
			  		  true || true -> true
			  		  true || false -> true
			  		  false || true -> true
			  		  false || false -> false
			  		  
			  ^(XOR): 앞뒤 값이 같을 때 false, 앞뒤 값이 다를 때 true
			  		  true ^ true -> false
			  		  true ^ false -> true
			  		  false ^ true -> true
			  		  false ^ false -> false
			  		  
			  !(NOT): true일 때 false, false일 때 true
	  
			  		  
		*/
		
		//&&(AND) 연산: 모두 true일 때, true
		System.out.println(true && true);	//true
		System.out.println(true && false);	//false
		System.out.println(false && true);	//false
		System.out.println(false && false);	//false
		
		System.out.println("===============================");
		//||(OR) 연산: 하나라도 true이면 true
		System.out.println(true || true);	//true
		System.out.println(true || false);	//true
		System.out.println(false || true);	//true
		System.out.println(false || false);	//false
		
		System.out.println("===============================");
		//^(XOR) 연산: 앞뒤 값이 같을 때 false, 앞뒤 값이 다를 때 true
		System.out.println(true ^ true);	//false	
		System.out.println(true ^ false);	//true
		System.out.println(false ^ true);	//true
		System.out.println(false ^ false);	//false		

		System.out.println("===============================");
		//!(NOT) 연산: true일 때 false, false일 때 true
		System.out.println(!true);	//false	
		System.out.println(!false);	//true
		
		System.out.println("========쇼트 서킷 발생 예문 ========");
		//논리 연산자는 쇼트 서킷이 발생될 수 있다. 비트 연산자를 사용해서 쇼트 서킷을 방지할 수 있다.
			//앞에 연산자로만 결과값을 유추할 수 있는 경우 뒤에 오는 값은 처리하지 않고 결과를 돌라준다.
				//AND 연산에서 앞에 false가 올 경우 쇼트 서킷이 발생함
				//OR 연산에서 앞에 true가 올 경우 쇼트 서킷이 발생함
		
		/*쇼트 서킷이 발생되지 않는 경우: && 연산에서 앞에 true 뒤에 값을 확인 후 결과를 리턴
								   || 연산에서 앞에 false 뒤에 값을 확인 후 결과를 리턴
								 
          쇼트 서킷이 발생되는 경우: && 연산에서 앞에 false 뒤에 값은 무시하고 결과를 리턴
                               || 연산에서 앞에 true 뒤에 값을 무시하고 결과를 리턴
		*/
		
		//&& 연산에서 쇼트 서킷 발생
		int val10 = 3;
		
		System.out.println(false && ++val10 > 6);	//쇼트 서킷이 발생됨
		System.out.println(val10);		//3
		
		int val11 = 3;
		
		System.out.println(true || ++val11 > 6);	//or 앞에 true일 때, 뒤 값은 실행하지 않는다
		System.out.println(val11);
		
		System.out.println("========쇼트 서킷을 방지하는 방법 ========");
		
		//비트 연산자를 사용해서 쇼트 서킷을 방지할 수 있다. &(AND), |(OR)
			//비트 연산, 논리 연산(쇼트 서킷을 방지할 때 사용됨)
		
		int val12 = 3;
		
		System.out.println(false & ++val12 > 6);	//비트 연산자가 논리 연산할 때도 사용 가능, 쇼트 서킷을 방지
		System.out.println(val12);
		
		//OR 연산에서 쇼트 서킷 방지: |
		int val13 = 3;
		
		System.out.println(true | ++val13 > 6);
		System.out.println(val13);
		
		
	}

}
