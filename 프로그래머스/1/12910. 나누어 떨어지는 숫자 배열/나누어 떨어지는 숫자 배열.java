import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int x : arr) {
            if (x % divisor == 0) {
                list.add(x);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        return list.stream().sorted().mapToInt(i -> i).toArray();
    }
}
