import java.util.HashMap;

class Solution {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i=0; i<want.length; i++){
            map.put(want[i], number[i]);
        }

        for(int i=0; i<10; i++){
            map2.put(discount[i], map2.getOrDefault(discount[i], 0) + 1);
        }
        if(map.equals(map2)) answer++;
        for(int i=10; i<discount.length; i++){
            map2.put(discount[i], map2.getOrDefault(discount[i], 0) + 1);
            map2.put(discount[i-10], map2.get(discount[i-10])-1);
            if(map2.get(discount[i-10]) == 0) map2.remove(discount[i - 10]);
            if(map.equals(map2)) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        solution(want, number, discount);
    }
}