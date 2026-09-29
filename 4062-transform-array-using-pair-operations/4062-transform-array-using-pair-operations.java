import java.util.Arrays;

class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long sum1=Arrays.stream(source).asLongStream().sum();
        long sum2=Arrays.stream(target).asLongStream().sum();
        return sum1==sum2;
    }
}