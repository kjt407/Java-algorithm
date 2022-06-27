package study_algorithm;

import java.util.*;


import java.io.*;

// 제한시간 150ms 이 문제는 반복문으로 연산하면 절대안됨
// Scanner 객체의 특성상 150ms 조건을 통과하기 매우 어려움 BufferedReader를 사용!!
public class P2869 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		int day = 0;
		
		// 총 높이에서 dwon만큼을 뺀 것에 하루 이동치를 나누어 몫을 구한다
		day = (length-down) / (up-down);
		// 위 연산은 한계가 있음 딱 나누어 떨어지지 않고 나머지가 존재한다면 아직 한번의 up이 더 필요한 상황
		// 즉 하루가 더 소요된다.
		if( (length-down) % (up-down) != 0 ) day++;
		
		System.out.println(day);
	}
}