import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> integerSet = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        return Math.min(nums.length / 2, integerSet.size());
    }
}