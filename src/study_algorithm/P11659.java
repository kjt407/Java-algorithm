package study_algorithm;

import java.util.*;
import java.io.*;

// ������ ���ϱ�
public class P11659 {

    public static void main(String[] args) throws IOException{
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int fnNo = Integer.parseInt(stringTokenizer.nextToken());
        
        long[] preArray = new long[suNo+1];
        
        // �Է°� ���ÿ� �� �迭 ����
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=1; i<=suNo; i++){
            preArray[i] = preArray[i-1]+Integer.parseInt(stringTokenizer.nextToken());
        }
        
        // �չ迭�� ������� ������ ����
        for(int i=0; i<fnNo; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(preArray[end]-preArray[start-1]);
        }
        
    }
}
