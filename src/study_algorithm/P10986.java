package study_algorithm;

import java.util.*;
import java.io.*;

// 나머지 합 구하기
public class P10986 {

	public static void main(String[] args) throws Exception{
		// 한줄에 토큰단위로 입력 받기위한 세팅
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		
		// 합배열 S, 나머지 값이 같은 원소들의 개수 카운팅하는 C배열
		// C배열을 key, value와 비슷하게 활용됨 EX)C[0]=3, C[1]=2 나머지가 0인 원소 3개, 1인 원소 2개
		long[] S = new long[N];
		long[] C = new long[M];
		long answer = 0;
		
		// 원소 N개 입력받아 합배열 생성
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		S[0] = Integer.parseInt(stringTokenizer.nextToken());
		for(int i=1; i<N; i++) {
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		// 나머지 값이 0인 원소만큼 정답 카운트, 나머지 값이 같은 원소 배열 C 카운트
		for(int i=0; i<N; i++) {
			int remainder = (int) (S[i]%M);
			if(remainder == 0) answer++;
			C[remainder]++;
		}
		
		// 나머지 값이 중복되는 원소중 2개를 선택하는 조합의 개수만큼 정답에 추가
		for(int i=0; i<M; i++){
			if(C[i]>1){
				answer = (answer+ (C[i] * (C[i]-1)/2));
			}
		}
		// 정답출력
		System.out.println(answer);
	}
	
}
