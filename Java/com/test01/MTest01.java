package com.test01;

public class MTest01 {

	
	public static void main(String[] args) {
		System.out.println(plusMinus(24));
	}
	
	public static boolean plusMinus(int input) {
		boolean res = false;
		//초기값 에러나니까 
		// 초기값이 false니까 true를 구해라  초기값을 true를 하고싶다면 이중에서 false를구해라뜻 
		// int 0으로줄수도 타입에따라 쟨 논리형이라서 
		int a = 3;
		int b = 5;
		int tmp = a++ + ++a + ++a + b++ + --b;
				// 3(4) + 5(5) + 6(6) + 5(6) + 5(5) = 24 (괄호는 내부적 숫자)
		res = (tmp == input)? true : false;
		
		return res;
	}
}
