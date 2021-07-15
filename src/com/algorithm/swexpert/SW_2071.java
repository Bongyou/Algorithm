package com.algorithm.swexpert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_2071 {
    static int T;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        T = Integer.parseInt(br.readLine().trim()); // testcase를 받을 변수

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine().trim());

            int n = 0; // 각 줄의 숫자를 하나씩 받을 변수
            float sum = 0; // 각 줄의 합을 저장할 변수

            for (int i = 0; i < 10; i++) {
                n = Integer.parseInt(st.nextToken().trim());

                sum += n;
            }

            float avg = sum / 10;

            System.out.println("#" + t + " " + Math.round(avg));
        }
    }
}
