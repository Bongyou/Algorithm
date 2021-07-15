package com.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1018 {
    static int N, M, ans, cnt;
    static char status;
    static char[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine().trim());

        N = Integer.parseInt(st.nextToken().trim()); // 제공되는 보드의 행
        M = Integer.parseInt(st.nextToken().trim()); // 제공되는 보드의 열

        map = new char[N][M];

        for (int i = 0; i < N; i++) {
            char[] line = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                map[i][j] = line[j];
            }
        }

        ans = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                start_black(i, j);
                start_white(i, j);
            }
        }

        System.out.println(ans);
    }

    private static void start_white(int i, int j) {
        status = 'W';
        cnt = 0;

        for (int r = i; r < i + 8; r++) {
            for (int c = j; c < j + 8; c++) {
                if (map[r][c] != status) {
                    cnt++;
                }

                if (cnt > ans) {
                    return;
                }

                if (c == j + 7) {
                    continue;
                } else {
                    status = status == 'B' ? 'W' : 'B';
                }
            }
        }

        ans = Math.min(ans, cnt);
    }

    private static void start_black(int i, int j) {
        status = 'B';
        cnt = 0;

        for (int r = i; r < i + 8; r++) {
            for (int c = j; c < j + 8; c++) {
                if (map[r][c] != status) {
                    cnt++;
                }

                if (cnt > ans) {
                    return;
                }

                if (c == j + 7) {
                    continue;
                } else {
                    status = status == 'B' ? 'W' : 'B';
                }
            }
        }

        ans = Math.min(ans, cnt);
    }
}
