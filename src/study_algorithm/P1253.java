package study_algorithm;

import java.util.*;
import java.io.*;

// 좋은 수 구하기 (대상이 되는 수가 N개의 제시된 수 두개의 합과 일치하는가) 투포인터 활용
public class P1253 {

	public static void main(String[] args) throws Exception{
		// 수의 개수 N, 재료의 목록을 위한 배열O, 완성된 갑옷의 수 count
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] O = new int[N];
		int count = 0;
		
		// 수의 갯수만큼 O배열을 초기화 시킴
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			O[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 O[]를 원소의 크기를 기준으로 오름차순 정렬함
		Arrays.sort(O);
		
		// 투포인터 로직
		// 시작 종료 포인터 위치 설정, 비교연산 대상이 되는 수의 인덱스 k
		// end위치의 값 보다 큰 값은 연산 없이도 k번째 원소보다 크다 하지만, 포인터의 end 위치가 k가 될 수 없는 이유를 잘 생각해 보자
		// EX) 0 0 1 2 3 4 5 5 5 5 -> count = 6
		for(int k=0; k<N; k++) {
			long find = O[k];
			int start = 0;
			int end = N-1;
			
			while(start < end) {
				int sum = O[start] + O[end]; 
				// 비교 대상과 두개의 포인터값의 합이 같을경우 자기 자신을 포함하고 있는지 확인하는 로직
				if(sum == find) {
					if(start != k && end != k) {
						// 이경우 O[k]의 값은 좋은 수 라는것이 확인되었다 결과값을 반영한뒤 while 문 종료
						count++;
						break;
					} else if (start == k) {
						start ++;
					} else if(end == k) {
						end --;
					}
				} else if(sum > find) {
					end --;
				}else {
					start ++;
				}
			}
		}
		// 문제의 핵심은 k번째 index의 값이 좋은수 인지 아닌지를 구분하는 것이 핵심
			
		// 정답 출력 및 BufferedReader close
		System.out.println(count);
		br.close();
	}
}