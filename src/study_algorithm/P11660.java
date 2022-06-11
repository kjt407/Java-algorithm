package study_algorithm;

import java.util.*;
import java.io.*;

public class P11660 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] origin = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int y=0; y<N; y++){
                origin[i][y] = Integer.parseInt(st.nextToken());
            }
        }
        // �չ迭�� �����ϴ� �������� ������ �ε����� �߻��ϱ� ������ N+1�� �迭�� �ʱ�ȭ ��Ŵ.
        int[][] preArray = new int[N+1][N+1];
        // ���� ���� ������ �ݺ� ���ۺ����� 1�� �ʱ�ȭ.
        for(int x=1; x<=N; x++){
            for(int y=1; y<=N; y++){
                preArray[x][y] = preArray[x-1][y] + preArray[x][y-1] - preArray[x-1][y-1] + origin[x-1][y-1]; 
            }
        }
        
        // �Է¹��� �� ��ŭ ����,������ ��ǥ�� �Է¹ް� ó���Ѵ�
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            
            int result = preArray[x2][y2] - preArray[x1-1][y2] - preArray[x2][y1-1] + preArray[x1-1][y1-1];
            System.out.println(result);
            
        }
        
	}
}
