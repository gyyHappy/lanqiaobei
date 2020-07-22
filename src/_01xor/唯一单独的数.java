package _01xor;

/**
 * @author GYY
 * @date 2020/2/15 12:46
 */
public class 唯一单独的数 {
    public static void main(String[] args) {
        int[] arr = {2,3,3,5,5,2,1,4,6,6,4,1,10};
        int result = 0;
        for (int i = 0; i <arr.length ; i++) {
            result = result ^ arr[i];
            if (i == arr.length-1){
                System.out.println(result);
            }
        }
    }
}
