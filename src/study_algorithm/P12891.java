package study_algorithm;

import java.util.*;
import java.io.*;


// 슬라이딩 윈도우 알고리즘을 활용한 DNA 비밀번호 제한시간 2초
// 문자열이 주어지고 구간이 고정적일때 효율적인 알고리즘 창틀과 창문을 여닫는 것과 비슷하여 sliding window
public class P12891 {
	static int[] checkNum;
	static int[] myNum;
	static int checked;


	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int frameN = Integer.parseInt(st.nextToken());
		int windowN = Integer.parseInt(st.nextToken());
		char[] frame = new char[frameN];
		checkNum = new int[4];
		myNum = new int[4];
		// A C G T 중 제약조건 통과된 개수 (슬라이딩 윈도우를 활용하기 때문에 이 변수를 따로 만들어서 활용한다)
		checked = 0;		
		int count = 0;
		
		
		// 문자열을 받아서 char[] 배열로 저장
		frame = br.readLine().toCharArray();
		
		// A C G T 최소 갯수 제약조건 설정
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			checkNum[i] = Integer.parseInt(st.nextToken());
			// 최소 갯수가 0이라면 이미 4개 단어중 제약조건 한개는 통과한 셈이 됨
			if(checkNum[i] == 0) checked++;
		}
		
		// 초기 window 조건 검사
		for(int i=0; i<windowN; i++) {
			add(frame[i]);
		}
		if(checked == 4) count++;

		
		for(int i = windowN; i < frameN; i++) {
			update(frame[i],frame[i-windowN]);
			if(checked == 4) count++;
		}
		
		System.out.println(count);
		
	}
	
	// 슬라이딩 윈도우에서 구간 이동시 업데이트를 위한 정적클래스를 정의
	private static void update(char add, char remove) {
		add(add);
		//remove
		switch(remove) {
		case 'A': 
			if(checkNum[0] == myNum[0]) checked--;
			myNum[0]--;
			break;
		case 'C': 
			if(checkNum[1] == myNum[1]) checked--;
			myNum[1]--;
			break;
		case 'G': 
			if(checkNum[2] == myNum[2]) checked--;
			myNum[2]--;
			break;
		case 'T': 
			if(checkNum[3] == myNum[3]) checked--;
			myNum[3]--;
			break;
		}

	}
	private static void add(char add) {
		switch(add) {
		case 'A': 
			myNum[0]++;
			if(checkNum[0] == myNum[0]) checked++;
			break;
		case 'C': 
			myNum[1]++;
			if(checkNum[1] == myNum[1]) checked++;
			break;
		case 'G': 
			myNum[2]++;
			if(checkNum[2] == myNum[2]) checked++;
			break;
		case 'T': 
			myNum[3]++;
			if(checkNum[3] == myNum[3]) checked++;
			break;
		}
	}
}