package study_algorithm;

import java.util.*;
import java.io.*;

//주몽의 명령 투포인터 활용하여 중복되지 않는 조합의 수 구하기
public class P1940 {

	public static void main(String[] args) throws Exception{
		// 재료의 수 N, 달성해야하는 일련번호 합의 값 M, 재료의 목록을 위한 배열O, 완성된 갑옷의 수 count
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] O = new int[N];
		int count = 0;
		
		// 재료의 수 만큼 재료의 목록을 초기화 시킴
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			O[i] = Integer.parseInt(st.nextToken());
		}
		
		// 재료의 크기를 기준으로 오름차순 정렬함
		Arrays.sort(O);
		
		// 투포인터 로직
		// 시작 종료 포인터 위치 설정
		int start = 0;
		int end = N-1;
		while(start < end) {
			int sum = O[start]+O[end];
			if(sum > M) {
				end --;
			}else if(sum < M) {
				start ++;
			}else {
				count ++;
				start++;
				end--;
			}
		}
			
		// 정답 출력 및 BufferedReader close
		System.out.println(count);
		br.close();
	}
}
