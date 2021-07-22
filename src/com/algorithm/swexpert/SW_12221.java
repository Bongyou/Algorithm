package com.algorithm.swexpert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_12221 {
    static int TC;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        TC = Integer.parseInt(br.readLine().trim());

        for (int tc = 1; tc <= TC; tc++) {
            st = new StringTokenizer(br.readLine().trim());

            int first = Integer.parseInt(st.nextToken().trim());
            int second = Integer.parseInt(st.nextToken().trim());

            System.out.println("#" + tc + " " + ((first >= 10 || second >= 10) ? -1 : first * second));
        }
    }
}
