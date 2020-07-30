package _2018真题;

import java.util.*;

/**
 * 小明维护着一个程序员论坛。现在他收集了一份"点赞"日志，日志共有N行。其中每一行的格式是：
 * <p>
 * ts id
 * <p>
 * 表示在ts时刻编号id的帖子收到一个"赞"。
 * <p>
 * 现在小明想统计有哪些帖子曾经是"热帖"。如果一个帖子曾在任意一个长度为D的时间段内收到不少于K个赞，小明就认为这个帖子曾是"热帖"。
 * <p>
 * 具体来说，如果存在某个时刻T满足该帖在[T, T+D)这段时间内(注意是左闭右开区间)收到不少于K个赞，该帖就曾是"热帖"。
 * <p>
 * 给定日志，请你帮助小明统计出所有曾是"热帖"的帖子编号。
 * <p>
 * 【输入格式】
 * 第一行包含三个整数N、D和K。
 * 以下N行每行一条日志，包含两个整数ts和id。
 * <p>
 * 对于50%的数据，1 <= K <= N <= 1000
 * 对于100%的数据，1 <= K <= N <= 100000 0 <= ts <= 100000 0 <= id <= 100000
 * <p>
 * 【输出格式】
 * 按从小到大的顺序输出热帖id。每个id一行。
 * <p>
 * 【输入样例】
 * 7 10 2
 * 0 1
 * 0 10
 * 10 10
 * 10 1
 * 9 1
 * 100 3
 * 100 3
 * <p>
 * 【输出样例】
 * 1
 * 3
 *
 * @author GYY
 * @version 1.0
 * @date 2020/7/30 8:58
 */
public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Node> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new Node(a, b));
            map.put(b, 0);
        }

        Collections.sort(list);

        int min = list.get(0).t, max, i = 0, j = 0;
        while (j < n){
            Node o = list.get(j);
            max = o.t;
            map.put(o.id,map.get(o.id)+1);
            while (max - min >= d){
                Node v = list.get(i);
                map.put(v.id,map.get(v.id) - 1);
                i++;
                min = list.get(i).t;
            }
            if (map.get(o.id) >= k){
                set.add(o.id);
            }
            j++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int x : set){
            ans.add(x);
        }
        Collections.sort(ans);
        for (Integer an : ans) {
            System.out.println(an);
        }
    }

    static class Node implements Comparable<Node> {
        int t, id;

        public Node(int t, int id) {
            this.t = t;
            this.id = id;
        }

        @Override
        public int compareTo(Node o) {
            return this.t - o.t;
        }
    }
}
