import java.util.*;

public class collections_ {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        // System.out.println(arr);

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        // for (Map.Entry<String, Integer> entry : map.entrySet()) {
        // System.out.println(entry);
        // }
        map.forEach((k, v) -> System.out.println("Key = " + k + " Value = " + v));
    }
}
