package study_algorithm;

import java.util.*;
import java.io.*;

// 구간합 구하기
public class P11659 {

    public static void main(String[] args) throws IOException{
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int fnNo = Integer.parseInt(stringTokenizer.nextToken());
        
        long[] preArray = new long[suNo+1];
        
        // 입력과 동시에 합 배열 생성
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=1; i<=suNo; i++){
            preArray[i] = preArray[i-1]+Integer.parseInt(stringTokenizer.nextToken());
        }
        
        // 합배열을 기반으로 구간합 연산
        for(int i=0; i<fnNo; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(preArray[end]-preArray[start-1]);
        }
        
    }
}
