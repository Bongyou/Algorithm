package com.algorithm.swexpert;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SW_1289 {
    static int TC, ans;
    static int[] memory, init;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TC = Integer.parseInt(br.readLine().trim());

        for (int tc = 1; tc <= TC; tc++) {
            char[] line = br.readLine().trim().toCharArray();

            memory = new int[line.length];  // 메모리 원래의 값을 저장
            init = new int[line.length];    // 메모리 초기 값

            for (int n = 0; n < line.length; n++) {
                memory[n] = line[n] - '0';
            }

            ans = 0;

            for (int i = 0; i < line.length; i++) {
                if (init[i] == memory[i]) {
                    // 이번 자릿수가 초기 값과 원래 값이 같다면
                    continue;
                } else {
                    // 이번 자릿수가 초기 값과 원래 값이 다르다면
                    int num = memory[i];

                    for (int j = i; j < line.length; j++) {
                        init[j] = num;
                    }

                    ans++;
                }
            }

            System.out.println("#" + tc + " " + ans);
        }
    }
}
