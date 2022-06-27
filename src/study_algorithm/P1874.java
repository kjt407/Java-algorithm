package study_algorithm;

import java.util.*;
import java.io.*;


// 스택을 활용하여 수열 만들기
public class P1874 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] A = new int[N];
		
		// N개의 숫자 배열 초기화
		for(int i=0; i<N ; i++) {
			br = new BufferedReader(new InputStreamReader(System.in));
			A[i] = Integer.parseInt(br.readLine());
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		
		// 최종 출력을 위한 StringBuffer
		StringBuffer sb = new StringBuffer();
		
		// 오름차순 자연수 num, target과 num이 같아질때까지 num을 증가시키며 push
		int num = 1;
		boolean result= true;
		
		for(int i=0; i<A.length; i++) {
			int target = A[i];
			
			if(target >= num) {
				while(target >= num) {
					stack.push(num++);	//자연수 num이 target보다 작은값일 경우 push()
					sb.append("+\n");
				}				
				stack.pop();
				sb.append("-\n");
			} else {
				int n = stack.pop();
				
				if(n>target) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					sb.append("-\n");
				}
			}
		}
		if(result) System.out.println(sb.toString());
	}
}
