package study_algorithm;

import java.util.*;
import java.io.*;

// ������ �� ���ϱ�
public class P10986 {

	public static void main(String[] args) throws Exception{
		// ���ٿ� ��ū������ �Է� �ޱ����� ����
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		
		// �չ迭 S, ������ ���� ���� ���ҵ��� ���� ī�����ϴ� C�迭
		// C�迭�� key, value�� ����ϰ� Ȱ��� EX)C[0]=3, C[1]=2 �������� 0�� ���� 3��, 1�� ���� 2��
		long[] S = new long[N];
		long[] C = new long[M];
		long answer = 0;
		
		// ���� N�� �Է¹޾� �չ迭 ����
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		S[0] = Integer.parseInt(stringTokenizer.nextToken());
		for(int i=1; i<N; i++) {
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		// ������ ���� 0�� ���Ҹ�ŭ ���� ī��Ʈ, ������ ���� ���� ���� �迭 C ī��Ʈ
		for(int i=0; i<N; i++) {
			int remainder = (int) (S[i]%M);
			if(remainder == 0) answer++;
			C[remainder]++;
		}
		
		// ������ ���� �ߺ��Ǵ� ������ 2���� �����ϴ� ������ ������ŭ ���信 �߰�
		for(int i=0; i<M; i++){
			if(C[i]>1){
				answer = (answer+ (C[i] * (C[i]-1)/2));
			}
		}
		// �������
		System.out.println(answer);
	}
	
}
