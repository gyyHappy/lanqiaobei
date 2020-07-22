package _2020第一场;

/**
 * 本题总分：5 分
 * 【问题描述】
 * 小明要做一个跑步训练。
 * 初始时，小明充满体力，体力值计为 10000 。如果小明跑步，每分钟损耗 600 的体力。如果小明休息，每分钟增加 300 的体力。
 * 体力的损耗和增加都是均匀变化的。
 * 小明打算跑一分钟、休息一分钟、再跑一分钟、再休息一分钟……如此循环。如果某个时刻小明的体力到达 0 ，他就停止锻炼。
 * 请问小明在多久后停止锻炼。为了使答案为整数，请以秒为单位输出答案。答案中只填写数，不填写单位。
 *
 * @author GYY
 * @version 1.0
 * @date 2020/7/22 11:25
 */
public class One {
    public static void main(String[] args) {
        int max = 10000;
        int increase = 5;
        int decrease = 10;
        int times = 1;
        int res = 0;
        while (max > 0) {
            for (int i = 1; i <= 60; i++) {
                if (max <= 0) {
                    break;
                }
                if (times % 2 !=0){
                    max = max - decrease;
                }else {
                    max = max + increase;
                }
                res++;
            }
            times++;
        }
        System.out.println(res);
    }
}
