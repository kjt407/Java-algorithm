package study_algorithm.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class P1874 {
	
	//sudo 코드를 통해 분기를 구성한 뒤 코드로 옮겨보자
	public static void main(String[] args) throws IOException {
		// 입력받을 수열의 수 N을 입력받는다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// N개의 int 배열 A[]를 생성
		int[] A = new int[N];
		
		// N번씩 반복하며 A[N]의 값을 입력받음
		for(int i=0; i<N; i++) {
			br = new BufferedReader(new InputStreamReader(System.in));
			A[i] = Integer.parseInt(br.readLine());
		}
		
		// 1~N 까지 오름차순으로 증가시킬 자연수 num 선언/초기화
		int num = 1;
		Stack<Integer> stack = new Stack<Integer>();	//스택 초기화
		// A[].length 만큼 반복하며 A[i]를 target으로 자연수 num을 비교
		for(int i=0; i<A.length; i++) {
			int target = A[i];	//현재 비교대상이 되는 수열의 값
		
			/** 분기를 잘 구성해 보자 **/
			if(target >= num) {
				while(target >= num) {
					
				}
			}else {
				
			}
			
		}
		
		
	}
}
