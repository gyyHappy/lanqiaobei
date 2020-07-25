package _2020第一场;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author GYY
 * @version 1.0
 * @date 2020/7/25 11:21
 * 【问题描述】
 * <p>
 * 小明正在做一个网络实验。
 * <p>
 * 他设置了 n 台电脑，称为节点，用于收发和存储数据。
 * <p>
 * 初始时，所有节点都是独立的，不存在任何连接。
 * <p>
 * 小明可以通过网线将两个节点连接起来，连接后两个节点就可以互相通信
 * <p>
 * 了。两个节点如果存在网线连接，称为相邻。
 * <p>
 * 小明有时会测试当时的网络，他会在某个节点发送一条信息，信息会发送
 * <p>
 * 到每个相邻的节点，之后这些节点又会转发到自己相邻的节点，直到所有直接
 * <p>
 * 或间接相邻的节点都收到了信息。所有发送和接收的节点都会将信息存储下来。
 * <p>
 * 一条信息只存储一次。
 * <p>
 * 给出小明连接和测试的过程，请计算出每个节点存储信息的大小。
 * <p>
 * 【输入格式】
 * <p>
 * 输入的第一行包含两个整数 n, m，分别表示节点数量和操作数量。节点从
 * <p>
 * 1 至 n 编号。
 * <p>
 * 接下来 m 行，每行三个整数，表示一个操作。
 * <p>
 * 如果操作为 1 a b，表示将节点 a 和节点 b 通过网线连接起来。当 a = b
 * <p>
 * 时，表示连接了一个自环，对网络没有实质影响。
 * <p>
 * 如果操作为 2 p t，表示在节点 p 上发送一条大小为 t 的信息。
 * <p>
 * 【输出格式】
 * <p>
 * 输出一行，包含 n 个整数，相邻整数之间用一个空格分割，依次表示进行
 * <p>
 * 完上述操作后节点 1 至节点 n 上存储信息的大小。
 * <p>
 * 试题J: 网络分析 12第十一届蓝桥杯大赛软件类省赛 C/C++ 大学 B 组
 * <p>
 * 【样例输入】
 * <p>
 * 4 8
 * <p>
 * 1 1 2
 * <p>
 * 2 1 10
 * <p>
 * 2 3 5
 * <p>
 * 1 4 1
 * <p>
 * 2 2 2
 * <p>
 * 1 1 2
 * <p>
 * 1 2 4
 * <p>
 * 2 2 1
 * <p>
 * 【样例输出】
 * <p>
 * 13 13 5 3
 * <p>
 * 【评测用例规模与约定】
 * <p>
 * 对于 30% 的评测用例，1 ≤ n ≤ 20，1 ≤ m ≤ 100。
 * <p>
 * 对于 50% 的评测用例，1 ≤ n ≤ 100，1 ≤ m ≤ 1000。
 * <p>
 * 对于 70% 的评测用例，1 ≤ n ≤ 1000，1 ≤ m ≤ 10000。
 * <p>
 * 对于所有评测用例，1 ≤ n ≤ 10000，1 ≤ m ≤ 100000，1 ≤ t ≤ 100。
 */
public class Ten {
    static int[] data;
    static boolean[] bool;
    static LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        data = new int[n + 1];
        bool = new boolean[n + 1];
        int a = 0, b = 0, c = 0;
        for (int i = 0; i <= n; i++) {
            list.add(new LinkedList<>());
        }
        for (int i = 0; i < m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            //网络题把他们互相联系起来
            if (a == 1) {
                list.get(b).add(c);
                list.get(c).add(b);
            } else {

                bool = new boolean[n + 1];
                dfs(b, c);
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(data[i]);
        }
    }

    //dfs遍历每一个结点
    public static void dfs(int node, int num) {
        bool[node] = true;
        data[node] += num;
        LinkedList<Integer> templist = list.get(node);
        for (int i : templist) {
            if (!bool[i]) {

                dfs(i, num);

            }
        }
    }
}
