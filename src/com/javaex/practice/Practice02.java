package com.javaex.practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
		/*System.out.println("1. 오류 수정-----------------------------------------------------");
		int age = 15;
		
		if(0 <age && age <18) {
			System.out.println("청소년입니다.");
		}*/
		
		
		
		/*System.out.println("2. 오류 수정------------------------------------------------------------");
		
		int x = 0;
		
		if(x == 0) {
			System.out.println("x는 0이다.");
		}*/
		
		
		
		/*System.out.println("3. 코드 작성-----------------------------------------------------------------");
		
		int age;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.println("나이 : ");
		age = scan.nextInt();
		
		if(age > 20) {
			System.out.println("/1번 그룹/");
		}else {
			System.out.print("/2번 그룹/");
		}
		System.out.println(" 입니다.");
		
		scan.close();*/
		
		
		
		/*System.out.println("4.나이를 입력받아 19세 이상 65세 미만이면 1번그룹 그외에는 2번그룹----------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("너님 나이는?");
		int age = scan.nextInt();
		
		if(age >= 19 && age < 65) {
			System.out.println("1번 그룹");
		}else {
			System.out.println("2번 그룹");
		}
		
		scan.close();*/
		
		
		
		
		/*System.out.println("5. 키와 몸무게를 입력받아 저체중, 표준, 과체중 판별-----------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.println("키: ");
		double height = scan.nextInt();
		
		System.out.println("몸무게: ");
		double weight = scan.nextInt();
		
		double result1;
		result1 = (height - 100) * 0.9;
		
		double result2;
		result2 = (weight/result1)*100;
		
		if(result2 < 100) {
			System.out.println("저체중입니다.");
			
		}else if(result2 >= 100 && result2 < 110){
			System.out.println("정상체중입니다.");
			
		}else if(result2 >= 110) {
			System.out.println("과체중입니다.");
		}
		
		
		System.out.println("표준체중: " + result1);
		
		scan.close();*/
		
		
		/*System.out.println("6. 큰수와 작은수 분류------------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		
		System.out.println("숫자1: ");
		int num1 = scan.nextInt();
		
		System.out.println("숫자2: ");
		int num2 = scan.nextInt();
		
		if(num1 < num2) {
			System.out.println("큰수: " + num2 + "                작은수: " + num1);
		}else {
			System.out.println("큰수: " + num1 + "                작은수: " + num2);
		}
		
		scan.close();*/
				
		
		
		
		
		/*System.out.println("7. 두개의 정수를 입력받아 큰수를 작은수로 나눈 몫과 나머지 출력------------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		int num1 = scan.nextInt();
		
		System.out.println("두번째 숫자: ");
		int num2 = scan.nextInt();
		
		if(num1 < num2) {
			System.out.println("몫: " + num2/num1);
			System.out.println("나머지: " + num2%num1);
		}else {
			System.out.println("몫: " + num1/num2);
			System.out.println("나머지: " + num1%num2);
		}
		
		scan.close();*/
		
		
		
		
		/*System.out.println("8. 정수 3개를 입력받아 가장 작은 수 출력------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요.");
		System.out.println("숫자1: ");
		int num1 = scan.nextInt();
		
		System.out.println("숫자2: ");
		int num2 = scan.nextInt();
		
		System.out.println("숫자3: ");
		int num3 = scan.nextInt();
		
		if(num1 < num2 && num1 < num3) {
			System.out.println("가장 작은수는 " + num1 + " 입니다.");
		}else if(num2 < num1 && num2 <num3) {
			System.out.println("가장 작은수는 " + num2 + " 입니다.");
		}else {
			System.out.println("가장 작은수는 " + num3 + " 입니다.");
		}
		
		
		scan.close();*/
		
		
		/*System.out.println("9. 두개의 정수를 입력받아 큰수의 약수인지 확인--------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		int num1 = scan.nextInt();
		
		System.out.println("두번째 숫자: ");
		int num2 = scan.nextInt();
		
		int result;
		
		if(num1 < num2) {
			result = num2 % num1;
			
			if(result == 0) {
				System.out.println(num1 + " 은 " + num2 + "의 약수입니다.");
			}else {
				System.out.println(num1 + " 은 " + num2 + "의 약수가 아닙니다.");
			}
		}else {
			result = num1 % num2;
			
			if(result == 0) {
				System.out.println(num2 + " 은 " + num1 + "의 약수입니다.");
			}else {
				System.out.println(num2 + " 은 " + num1 + "의 약수가 아닙니다.");
			}
		}
		
		
		scan.close();*/
		
	
		
		
		/*System.out.println("10. 사번(양의 정수)를 입력하면 팀을 확인------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요.");
		int num = scan.nextInt();
		
		int result;
		result = num / 3;
		
		System.out.println(result);
		
		switch(result){
			case 1:
				System.out.println("B팀 입니다.");
				break;
			case 2:
				System.out.println("C팀 입니다.");
				break;
			default:
				System.out.println("A팀 입니다.");
				break;
				
		}
		
		scan.close();*/
		
		
		
		
		/*System.out.println("11.알파벳을 입력받아 자음 모음 구분---------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		
		System.out.println("알파벳: ");
		char a = scan.next().charAt(0);
		
		switch(a) {
			case 'a':
				System.out.println("모음니다.");
				break;
			case 'b':
				System.out.println("자음니다.");
				break;
			case 'c':
				System.out.println("자음니다.");
				break;
			case 'd':
				System.out.println("모자음니다음니다.");
				break;
			case 'e':
				System.out.println("모음니다.");
				break;
			case 'f':
				System.out.println("자음니다.");
				break;
			case 'g':
				System.out.println("자음니다.");
				break;
			case 'h':
				System.out.println("자음니다.");
				break;
			case 'i':
				System.out.println("모음니다.");
				break;
			case 'j':
				System.out.println("자음니다.");
				break;
			case 'k':
				System.out.println("자음니다.");
				break;
			case 'l':
				System.out.println("자음니다.");
				break;
			case 'm':
				System.out.println("자음니다.");
				break;
			case 'n':
				System.out.println("자음니다.");
				break;
			case 'o':
				System.out.println("모음니다.");
				break;
			case 'p':
				System.out.println("자음니다.");
				break;
			case 'q':
				System.out.println("자음니다.");
				break;
			case 'r':
				System.out.println("자음니다.");
				break;
			case 's':
				System.out.println("자음니다.");
				break;
			case 't':
				System.out.println("자음니다.");
				break;
			case 'u':
				System.out.println("모음니다.");
				break;
			case 'v':
				System.out.println("자음니다.");
				break;
			case 'w':
				System.out.println("모음니다.");
				break;
			case 'x':
				System.out.println("자음니다.");
				break;
			case 'y':
				System.out.println("모음니다.");
				break;
			case 'z':
				System.out.println("자음니다.");
				break;
		}
		
		scan.close();*/
		
		
		
		
		
		
		
		/*System.out.println("12.계산기----------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.println("기호: ");
		char a = scan.next().charAt(0);
		
		System.out.println("숫자1: ");
		int num1 = scan.nextInt();
		
		System.out.println("숫자2: ");
		int num2 = scan.nextInt();
		
		
		switch(a) {
			case '+':
				double result = num1 + num2;
				System.out.println("결과는: " + result );
				break;
			case '-':
				double result1 = num1 - num2;
				System.out.println("결과는: " + result1);
				break;
			case '/':
				if(num2 == 0) {
					System.out.println("계산할 수 없습니다.");
					break;
				}else {
					double result3 = (double)num1 / (double)num2;
					System.out.println("결과는: " + result3);
					break;
				}
			case '*':
				double result4 = num1 * num2;
				System.out.println("결과는: " + result4);
				break;
				
			default:
				System.out.println("계산할 수 없는 기호입니다.");
				break;
				
		}
		
		scan.close();*/
		
		
		
		/*System.out.println("13. 함수값 계산----------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력 해주세요");
		System.out.println("숫자: ");
		float num = scan.nextFloat();
		float result;
		
		if(num <= 0) {
			result = (num * num * num) - (9*num) + 2;
		}else {
			result = (7*num) + 2 ;
		}
		
		System.out.println("계산결과는 " + result + " 입니다.");
		
		scan.close();*/
		
		
		System.out.println("14.소득세 계산--------------------------------------------------------------");
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요.");
		System.out.println("금익: ");
		double money = scan.nextDouble();
		double tax;
//		money = money * 10000;
		
		if(money <= 1000 && 0 <= money ) {
			tax = 0.09 * money;
			System.out.println(tax);
			
		}else if(money > 1000 && money <= 4000 ) {
			tax = 1000 * 0.09 + 0.18 * (money - 1000);
			System.out.println(tax);
			
		}else if(money < 8000 && money > 4000) {
			tax = 1000 * 0.09 + 3000 * 0.18 + 0.27 * (money - 4000);
			System.out.println(tax);
			
		}else if(money >= 8000) {
			tax = 1000 * 0.09 + 3000 * 0.18 + 4000 * 0.27 + 0.36 * (money - 8000);
			System.out.println(tax);
			
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		scan.close();
		
	}
}
