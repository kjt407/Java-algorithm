package study_algorithm;

import java.util.*;
import java.io.*;

// 평균 구하기
public class P1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        
        long sum = 0;
        long max = 0;
        
        // 최고값 획득을 위한 비교 연산
        // 점수의 총합
        for(int i=0; i < N; i++){
            if(A[i]>max) max = A[i];
            sum = sum+A[i];
        }
        
        System.out.println(sum*100.0/max/N);
    }
}