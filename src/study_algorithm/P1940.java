package study_algorithm;

import java.util.*;
import java.io.*;

//�ָ��� ��� �������� Ȱ���Ͽ� �ߺ����� �ʴ� ������ �� ���ϱ�
public class P1940 {

	public static void main(String[] args) throws Exception{
		// ����� �� N, �޼��ؾ��ϴ� �Ϸù�ȣ ���� �� M, ����� ����� ���� �迭O, �ϼ��� ������ �� count
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] O = new int[N];
		int count = 0;
		
		// ����� �� ��ŭ ����� ����� �ʱ�ȭ ��Ŵ
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			O[i] = Integer.parseInt(st.nextToken());
		}
		
		// ����� ũ�⸦ �������� �������� ������
		Arrays.sort(O);
		
		// �������� ����
		// ���� ���� ������ ��ġ ����
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
			
		// ���� ��� �� BufferedReader close
		System.out.println(count);
		br.close();
	}
}
