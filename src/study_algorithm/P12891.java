package study_algorithm;

import java.util.*;
import java.io.*;


// �����̵� ������ �˰����� Ȱ���� DNA ��й�ȣ ���ѽð� 2��
// ���ڿ��� �־����� ������ �������϶� ȿ������ �˰��� âƲ�� â���� ���ݴ� �Ͱ� ����Ͽ� sliding window
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
		// A C G T �� �������� ����� ���� (�����̵� �����츦 Ȱ���ϱ� ������ �� ������ ���� ���� Ȱ���Ѵ�)
		checked = 0;		
		int count = 0;
		
		
		// ���ڿ��� �޾Ƽ� char[] �迭�� ����
		frame = br.readLine().toCharArray();
		
		// A C G T �ּ� ���� �������� ����
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			checkNum[i] = Integer.parseInt(st.nextToken());
			// �ּ� ������ 0�̶�� �̹� 4�� �ܾ��� �������� �Ѱ��� ����� ���� ��
			if(checkNum[i] == 0) checked++;
		}
		
		// �ʱ� window ���� �˻�
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
	
	// �����̵� �����쿡�� ���� �̵��� ������Ʈ�� ���� ����Ŭ������ ����
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
