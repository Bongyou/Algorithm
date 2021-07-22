package com.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_5052 {
    static int TC, n, status;
    static String[] telList;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TC = Integer.parseInt(br.readLine().trim());

        for (int tc = 1; tc <= TC; tc++) {
            n = Integer.parseInt(br.readLine().trim());

            telList = new String[n];

            for (int i = 0; i < n; i++) {
                telList[i] = br.readLine().trim();
            }

            Arrays.sort(telList); // 사전 순 정렬

            status = 0;

            compare();

            System.out.println(status == 1 ? "NO" : "YES");
        }
    }

    public static void compare() {
        for (int i = 1; i < n; i++) {
            if (telList[i].startsWith(telList[i - 1])) {
                // startsWith : 비교 대상 문자열이 입력된 문자열로 시작하는지 판별하는 함수
                status = 1;

                return;
            }
        }
    }
}
