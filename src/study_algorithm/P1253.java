package study_algorithm;

import java.util.*;
import java.io.*;

// ���� �� ���ϱ� (����� �Ǵ� ���� N���� ���õ� �� �ΰ��� �հ� ��ġ�ϴ°�) �������� Ȱ��
public class P1253 {

	public static void main(String[] args) throws Exception{
		// ���� ���� N, ����� ����� ���� �迭O, �ϼ��� ������ �� count
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] O = new int[N];
		int count = 0;
		
		// ���� ������ŭ O�迭�� �ʱ�ȭ ��Ŵ
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			O[i] = Integer.parseInt(st.nextToken());
		}
		
		// �迭 O[]�� ������ ũ�⸦ �������� �������� ������
		Arrays.sort(O);
		
		// �������� ����
		// ���� ���� ������ ��ġ ����, �񱳿��� ����� �Ǵ� ���� �ε��� k
		// end��ġ�� �� ���� ū ���� ���� ���̵� k��° ���Һ��� ũ�� ������, �������� end ��ġ�� k�� �� �� ���� ������ �� ������ ����
		// EX) 0 0 1 2 3 4 5 5 5 5 -> count = 6
		for(int k=0; k<N; k++) {
			long find = O[k];
			int start = 0;
			int end = N-1;
			
			while(start < end) {
				int sum = O[start] + O[end]; 
				// �� ���� �ΰ��� �����Ͱ��� ���� ������� �ڱ� �ڽ��� �����ϰ� �ִ��� Ȯ���ϴ� ����
				if(sum == find) {
					if(start != k && end != k) {
						// �̰�� O[k]�� ���� ���� �� ��°��� Ȯ�εǾ��� ������� �ݿ��ѵ� while �� ����
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
		// ������ �ٽ��� k��° index�� ���� ������ ���� �ƴ����� �����ϴ� ���� �ٽ�
			
		// ���� ��� �� BufferedReader close
		System.out.println(count);
		br.close();
	}
}
