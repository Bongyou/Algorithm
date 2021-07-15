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

            int sum = 0;
            int n = 0;

            for (int i = 0; i < 10; i++) {
                n = Integer.parseInt(st.nextToken().trim());

                if (n % 2 == 1) {
                    sum += n;
                }
            }

            System.out.println("#" + t + " " + sum);
        }
    }
}
