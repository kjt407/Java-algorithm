package study_algorithm;

import java.util.*;


import java.io.*;

// ���ѽð� 150ms �� ������ �ݺ������� �����ϸ� ����ȵ�
// Scanner ��ü�� Ư���� 150ms ������ ����ϱ� �ſ� ����� BufferedReader�� ���!!
public class P2869 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		int day = 0;
		
		// �� ���̿��� dwon��ŭ�� �� �Ϳ� �Ϸ� �̵�ġ�� ������ ���� ���Ѵ�
		day = (length-down) / (up-down);
		// �� ������ �Ѱ谡 ���� �� ������ �������� �ʰ� �������� �����Ѵٸ� ���� �ѹ��� up�� �� �ʿ��� ��Ȳ
		// �� �Ϸ簡 �� �ҿ�ȴ�.
		if( (length-down) % (up-down) != 0 ) day++;
		
		System.out.println(day);
	}
}
