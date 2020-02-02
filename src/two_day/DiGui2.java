package two_day;

/**
 * @author GYY
 * @date 2020/1/26 12:26
 * 从m个球中取出n个球，有几种取法
 */
public class DiGui2 {
    public static void main(String[] args) {
        System.out.println(f(10,3));
    }
    public static int f(int n,int m){
        if (n<m){return 0;}
        if (n==m){return 1;}
        if (m==0){return 1;}
        return f(n-1,m-1) + f(n-1,m);
    }
}
