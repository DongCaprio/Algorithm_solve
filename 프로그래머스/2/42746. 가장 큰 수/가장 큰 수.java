import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] array = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(array, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        StringBuilder sb = new StringBuilder();
        for (String str : array) {
            sb.append(str);
        }

        return sb.charAt(0) == '0' ? "0" : sb.toString();
    }
}
