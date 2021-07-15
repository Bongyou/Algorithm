package com.algorithm.swexpert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_2072 {
    static int T;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        T = Integer.parseInt(br.readLine().trim());

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine().trim());

            int sum = 0; // 홀수 값의 합을 저장할 변수
            int n = 0; // 각 줄의 숫자를 저장할 변수

            for (int i = 0; i < 10; i++) {
                n = Integer.parseInt(st.nextToken().trim());

                if (n % 2 == 1) { // 값이 홀수라면
                    sum += n; // 더하기
                }
            }

            System.out.println("#" + t + " " + sum);
        }
    }
}
