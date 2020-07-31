package _2018真题;

import java.util.Scanner;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/7/31 10:47
 */
public class I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        ch = new char[n][n];
        vis = new int[n][n];

        for (int i = 0; i < n; i++)
            ch[i] = in.next().toCharArray();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                vis[i][j] = 0;
                if (ch[i][j] == '#' && is(i, j))
                    ch[i][j] = '*';
            }

        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (ch[i][j] == '#' && vis[i][j] == 0)
                    dfs(i, j, ++ans);


        for (int i = 0; i < n; i++) {//检查
            for (int j = 0; j < n; j++)
                System.out.print(ch[i][j]);
            System.out.println();
        }

        System.out.println(ans);
    }

    static int n;
    static char[][] ch;
    static int[][] vis;
    static int[] dx = new int[]{1, 0, -1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};

    static boolean is(int x, int y) {
        for (int i = 0; i < 4; i++)
            if (x + dx[i] >= 0 && x + dx[i] < n && y + dy[i] >= 0 && y + dy[i] < n && ch[x + dx[i]][y + dy[i]] == '.')
                return true;
        return false;
    }

    static void dfs(int x, int y, int t) {
        vis[x][y] = t;
        for (int i = 0; i < 4; i++)
            if (x + dx[i] >= 0 && x + dx[i] < n && y + dy[i] >= 0 && y + dy[i] < n && ch[x + dx[i]][y + dy[i]] == '#' && vis[x + dx[i]][y + dy[i]] == 0)
                dfs(x + dx[i], y + dy[i], t);
    }


}
