import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        List<String> list = new ArrayList<>();
        s = s.substring(2, s.length() - 2); // 양쪽 {{ 와 }} 제거
        String[] numbers = s.split("\\},\\{");
        Arrays.sort(numbers, (o1, o2) -> o1.length() - o2.length());
        Set<String> set = new HashSet<>();
        for (String number : numbers) {
            String[] split = number.split(",");
            for (String splitStr : split) {
                if (!set.contains(splitStr)) {
                    set.add(splitStr);
                    list.add(splitStr);
                    break;
                }
            }
        }
        return list.stream()
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
