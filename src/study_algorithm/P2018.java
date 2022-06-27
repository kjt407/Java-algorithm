package study_algorithm;

import java.util.*;
import java.io.*;

// 투포인터 = 연속된 자연수의 합이 조건일때 가장 효과적인 알고리즘
public class P2018 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while(end_index != N) {
			if(sum == N) {
				count++;
				end_index ++;
				sum = sum + end_index;
			}else if(sum > N) {
				sum = sum - start_index;
				start_index++;	
			}else {
				end_index++;
				sum = sum+end_index;
			}
		}
		
		System.out.println(count);
			
	}
}