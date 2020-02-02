package Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author GYY
 * @date 2020/1/22 10:15
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(4);
        map.put(1,"Hello");
        map.put(2,"World");
        map.put(3,"Tomorrow");

        System.out.println(map);

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("next:  "+ entry.getKey() + " - " +entry.getValue());
        }
    }
}
